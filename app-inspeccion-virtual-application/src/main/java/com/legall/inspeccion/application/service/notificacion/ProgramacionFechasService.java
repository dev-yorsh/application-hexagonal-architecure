package com.legall.inspeccion.application.service.notificacion;

import com.legall.inspeccion.application.ports.input.notificacion.pregramacionfecha.ProgramacionFechaReservarUseCase;
import com.legall.inspeccion.application.ports.input.notificacion.pregramacionfecha.exception.ProgramacionFechasUseCaseExecption;
import com.legall.inspeccion.application.ports.output.notificacion.programacionfechas.ProgramacionFechaFindAllAvailablePort;
import com.legall.inspeccion.application.ports.output.notificacion.programacionfechas.ProgramacionFechasSavePort;
import com.legall.inspeccion.application.service.util.GenericUtil;
import com.legall.inspeccion.domain.notificacion.ProgramacionFechas;

import java.time.LocalDateTime;

import static com.legall.inspeccion.application.service.constants.MensajeConstanteApplication.ProgramacionFechaMessageConstant.PROGRAMACION_FECHA_INCORRECTA;
import static com.legall.inspeccion.application.service.constants.MensajeConstanteApplication.ProgramacionFechaMessageConstant.PROGRAMACION_FECHA_OCUPADA;
import static com.legall.inspeccion.domain.constantes.Constants.EMPLEADO_SISTEMA;
import static com.legall.inspeccion.domain.constantes.Constants.TIEMPO_INSPECCION_SISTEMA;

public class ProgramacionFechasService implements ProgramacionFechaReservarUseCase {

    private final ProgramacionFechasSavePort programacionFechasSavePort;
    private final ProgramacionFechaFindAllAvailablePort programacionFechaFindAllAvailablePort;

    public ProgramacionFechasService(ProgramacionFechasSavePort programacionFechasSavePort,
                                     ProgramacionFechaFindAllAvailablePort programacionFechaFindAllAvailablePort) {
        this.programacionFechasSavePort = programacionFechasSavePort;
        this.programacionFechaFindAllAvailablePort = programacionFechaFindAllAvailablePort;
    }

    @Override
    public ProgramacionFechas reservarFecha(ProgramacionFechas programacionFechas) throws ProgramacionFechasUseCaseExecption {
        try {
            // TODO: Convertimos la fecha.
            LocalDateTime fechaProgramacion = this.convertToDate(programacionFechas.getFechaProgramada());

            // TODO: Validar que la fecha sea mayor a la fecha actual, caso contrario lanzar una excepcion.
            this.validarFechaProgramacion(fechaProgramacion);

            // TODO: Verificar si la fecha ya esta reservada, caso contrario lanzar una excepcion.
            this.verificarSiFechaEstaReservada(fechaProgramacion);

            // TODO: Calcular la fecha de finalizacion de la inspeccion.
            LocalDateTime fechaFinalizacion = fechaProgramacion.plusMinutes(TIEMPO_INSPECCION_SISTEMA);
            return saveProgramacionFecha(programacionFechas, fechaFinalizacion);
        } catch (Exception e){
            throw new ProgramacionFechasUseCaseExecption(e.getMessage());
        }

    }

    private LocalDateTime convertToDate(String fechaProgramada) {
        return GenericUtil.parseDateTime(fechaProgramada);
    }

    private void validarFechaProgramacion(LocalDateTime fechaProgramacion) {
        if (fechaProgramacion.isBefore(LocalDateTime.now())) {
            throw new ProgramacionFechasUseCaseExecption(PROGRAMACION_FECHA_INCORRECTA);
        }
    }

    private void verificarSiFechaEstaReservada(LocalDateTime fechaProgramacion) {
        programacionFechaFindAllAvailablePort.findAllAvailable().forEach(data -> {
            LocalDateTime fechaReservadaInicio = GenericUtil.parseDateTime(data.getFechaProgramada())
                    .minusMinutes(TIEMPO_INSPECCION_SISTEMA);
            LocalDateTime fechaReservadaFin = GenericUtil.parseDateTime(data.getFechaFinalizacion());
            if (fechaProgramacion.isBefore(fechaReservadaFin) && fechaProgramacion.isAfter(fechaReservadaInicio)) {
                throw new ProgramacionFechasUseCaseExecption(PROGRAMACION_FECHA_OCUPADA);
            }
        });
    }

    private ProgramacionFechas saveProgramacionFecha(ProgramacionFechas programacionFechas, LocalDateTime fechaFinalizacion) {
        programacionFechas.setEmpleadoId(EMPLEADO_SISTEMA.longValue());
        programacionFechas.setTiempoInspeccion(TIEMPO_INSPECCION_SISTEMA);
        programacionFechas.setEstaReservado(Boolean.TRUE);
        programacionFechas.setFechaFinalizacion(GenericUtil.formatDateDefault(fechaFinalizacion));
        return programacionFechasSavePort.save(programacionFechas);
    }

}
