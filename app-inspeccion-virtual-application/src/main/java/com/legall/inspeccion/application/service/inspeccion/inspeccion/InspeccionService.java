package com.legall.inspeccion.application.service.inspeccion.inspeccion;

import com.legall.inspeccion.application.ports.command.InspeccionSaveCommand;
import com.legall.inspeccion.application.ports.input.inspeccion.inspeccion.InspeccionSaveUseCase;
import com.legall.inspeccion.application.ports.input.inspeccion.inspeccion.exception.InspeccionUseCaseException;
import com.legall.inspeccion.application.ports.input.notificacion.pregramacionfecha.ProgramacionFechaReservarUseCase;
import com.legall.inspeccion.application.ports.input.notificacion.pregramacionfecha.exception.ProgramacionFechasUseCaseExecption;
import com.legall.inspeccion.application.ports.output.administracion.marca.MarcaFindByIdPort;
import com.legall.inspeccion.application.ports.output.informe.informe.InformeSavePort;
import com.legall.inspeccion.application.ports.output.inspeccion.inspeccion.InspeccionSavePort;
import com.legall.inspeccion.application.ports.output.inspeccion.tramite.TramiteFindByIdPort;
import com.legall.inspeccion.application.ports.output.inspeccion.vehiculo.VehiculoFindByPlacaPort;
import com.legall.inspeccion.application.ports.output.inspeccion.vehiculo.VehiculoSavePort;
import com.legall.inspeccion.application.service.util.GenericUtil;
import com.legall.inspeccion.domain.administracion.Marca;
import com.legall.inspeccion.domain.base.EstadoEnum;
import com.legall.inspeccion.domain.informe.Informe;
import com.legall.inspeccion.domain.informe.MotivoInformeEnum;
import com.legall.inspeccion.domain.informe.builder.InformeBuilder;
import com.legall.inspeccion.domain.inspeccion.EstadoInspeccionEnum;
import com.legall.inspeccion.domain.inspeccion.Inspeccion;
import com.legall.inspeccion.domain.inspeccion.Tramite;
import com.legall.inspeccion.domain.inspeccion.Vehiculo;
import com.legall.inspeccion.domain.notificacion.ProgramacionFechas;

import java.util.Optional;

import static com.legall.inspeccion.application.service.constants.MensajeConstanteApplication.InformeMessageConstant.NUEVO_INFORME;
import static com.legall.inspeccion.application.service.constants.MensajeConstanteApplication.InformeMessageConstant.PREFIJO_INFORME;
import static com.legall.inspeccion.application.service.constants.MensajeConstanteApplication.MarcaMessageConstant.MARCA_NO_ENCONTRADA;
import static com.legall.inspeccion.application.service.constants.MensajeConstanteApplication.TramiteMessageConstant.TRAMITE_NO_ENCONTRADO;


public class InspeccionService implements InspeccionSaveUseCase {

    private final InspeccionSavePort inspeccionSavePort;
    private final TramiteFindByIdPort tramiteFindByIdPort;
    private final VehiculoFindByPlacaPort vehiculoFindByPlacaPort;
    private final VehiculoSavePort vehiculoSavePort;
    private final MarcaFindByIdPort marcaFindByIdPort;
    private final InformeSavePort informeSavePort;
    private final ProgramacionFechaReservarUseCase programacionFechaReservarUseCase;

    public InspeccionService(InspeccionSavePort inspeccionSavePort, TramiteFindByIdPort tramiteFindByIdPort,
                             VehiculoFindByPlacaPort vehiculoFindByPlacaPort, VehiculoSavePort vehiculoSavePort,
                             MarcaFindByIdPort marcaFindByIdPort, InformeSavePort informeSavePort,
                             ProgramacionFechaReservarUseCase programacionFechaReservarUseCase) {
        this.inspeccionSavePort = inspeccionSavePort;
        this.tramiteFindByIdPort = tramiteFindByIdPort;
        this.vehiculoFindByPlacaPort = vehiculoFindByPlacaPort;
        this.vehiculoSavePort = vehiculoSavePort;
        this.marcaFindByIdPort = marcaFindByIdPort;
        this.informeSavePort = informeSavePort;
        this.programacionFechaReservarUseCase = programacionFechaReservarUseCase;
    }


    @Override
    public Boolean save(InspeccionSaveCommand inspeccionSaveCommand) throws InspeccionUseCaseException {

        // TODO: Validamos que exista un tramite, caso contrario lanzamos una excepcion.
        Tramite tramite = validarTramite(inspeccionSaveCommand.getTramiteId());

        inspeccionSaveCommand.getInspecciones().forEach(inspeccion -> {
            try {
                inspeccion.setTramiteId(tramite.getId());

                //TODO: Generamos el codigo de inspeccion.
                inspeccion.setCodigoInspeccion(this.generarCodigoInspeccion());
                inspeccion.setEstadoInspeccion(EstadoInspeccionEnum.EN_ESPERA);
                inspeccion.setEstado(EstadoEnum.ACTIVO);

                //TODO: Validar que exista la marca. Si no existe lanzamos una excepcion.
                this.validarMarca(inspeccion.getVehiculo().getMarcaId());

                //TODO: Validamos el vehiculo. Si no existe lo guardamos, si existe lo actualizamos.
                inspeccion.setVehiculo(this.validarVehiculo(inspeccion.getVehiculo()));

                //TODO: Validamos si la fecha de reserva esta disponible.
                ProgramacionFechas fechaReserva = this.programacionFechas(tramite.getAsegurado().getId(),
                        inspeccion.getFechaReservaInspeccion());

                //TODO: Almacenamos la inspeccion.
                Inspeccion inspeccionSaved = inspeccionSavePort.save(inspeccion);

                // TODO: Generamos y almacenamos un nuevo informe por cada inspeccion.
                saveInforme(inspeccionSaved.getId(), tramite.getAsegurado().getId(), fechaReserva);
                // Enviar el informe a la cola de mensajes
                // Guardar la inspeccion
            } catch (InspeccionUseCaseException e) {
                throw new InspeccionUseCaseException(e.getMessage(), e.getCause());
            } catch (ProgramacionFechasUseCaseExecption e) {
                throw new ProgramacionFechasUseCaseExecption(e.getMessage(), e.getCause());
            }
        });
        return true;

    }


    private Vehiculo validarVehiculo(Vehiculo vehiculo) {
        Optional<Vehiculo> optionalVehiculo = vehiculoFindByPlacaPort.findByPlaca(vehiculo.getPlaca());
        optionalVehiculo.ifPresent(value -> vehiculo.setId(value.getId()));
        vehiculo.setEstado(EstadoEnum.ACTIVO);
        return vehiculoSavePort.save(vehiculo);
    }

    private void validarMarca(Long marcaId) throws InspeccionUseCaseException {
        Optional<Marca> marcaOptional = marcaFindByIdPort.marcaFindById(marcaId);
        marcaOptional.orElseThrow(() -> new InspeccionUseCaseException(MARCA_NO_ENCONTRADA));
    }

    private Tramite validarTramite(Long tramiteId) throws InspeccionUseCaseException {
        Optional<Tramite> tramite = tramiteFindByIdPort.findById(tramiteId);
        return tramite.orElseThrow(() -> new InspeccionUseCaseException(TRAMITE_NO_ENCONTRADO));
    }

    private String generarCodigoInspeccion() {
        return PREFIJO_INFORME + GenericUtil.formatCurrentDate("yyMMddHHmmss");
    }

    private void saveInforme(Long inspeccionId, Long aseguradoId, ProgramacionFechas programacionFechas) {
        Informe informe = new InformeBuilder()
                .inspeccionId(inspeccionId).programacionFechas(programacionFechas)
                .motivoInforme(MotivoInformeEnum.PROGRAMADO).detalleInforme(NUEVO_INFORME)
                .estaAnulado(false).estado(EstadoEnum.ACTIVO)
                .build();
        informeSavePort.save(informe);
    }

    private ProgramacionFechas programacionFechas(long idAsegurado, String fechaReserva) {
        ProgramacionFechas programacionFechas = new ProgramacionFechas();
        programacionFechas.setAseguradoId(idAsegurado);
        programacionFechas.setFechaProgramada(fechaReserva);
        return programacionFechaReservarUseCase.reservarFecha(programacionFechas);
    }

}
