package com.legall.inspeccion.application.service.inspeccion.tramite;

import com.legall.inspeccion.application.ports.input.inspeccion.tramite.TramiteFinAllUseCase;
import com.legall.inspeccion.application.ports.input.inspeccion.tramite.TramiteFindByIdUseCase;
import com.legall.inspeccion.application.ports.input.inspeccion.tramite.TramiteSaveUseCase;
import com.legall.inspeccion.application.ports.input.inspeccion.tramite.TramiteUpdateConditionUseCase;
import com.legall.inspeccion.application.ports.input.inspeccion.tramite.exception.TramiteUseCaseException;
import com.legall.inspeccion.application.ports.output.administracion.asegurado.AseguradoFindByDocumentPort;
import com.legall.inspeccion.application.ports.output.administracion.asegurado.AseguradoSavePort;
import com.legall.inspeccion.application.ports.output.administracion.contratante.ContratanteFindByDocumentPort;
import com.legall.inspeccion.application.ports.output.administracion.contratante.ContratanteSavePort;
import com.legall.inspeccion.application.ports.output.administracion.contratante.ContratanteUpdateRazonSocialPort;
import com.legall.inspeccion.application.ports.output.inspeccion.tramite.TramiteFindAllPort;
import com.legall.inspeccion.application.ports.output.inspeccion.tramite.TramiteFindByIdPort;
import com.legall.inspeccion.application.ports.output.inspeccion.tramite.TramiteSavePort;
import com.legall.inspeccion.domain.administracion.Asegurado;
import com.legall.inspeccion.domain.administracion.Contratante;
import com.legall.inspeccion.domain.base.EstadoEnum;
import com.legall.inspeccion.domain.inspeccion.Tramite;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.legall.inspeccion.application.service.constants.MensajeConstanteApplication.TramiteMessageConstant.ERROR_GUARDAR_TRAMITE;
import static com.legall.inspeccion.application.service.constants.MensajeConstanteApplication.TramiteMessageConstant.TRAMITE_NO_ENCONTRADO;


public class TramiteService implements TramiteFinAllUseCase, TramiteFindByIdUseCase, TramiteSaveUseCase, TramiteUpdateConditionUseCase {

    private final TramiteFindAllPort tramiteFindAllPort;
    private final TramiteFindByIdPort tramiteFindByIdPort;
    private final TramiteSavePort tramiteSavePort;
    private final ContratanteFindByDocumentPort contratanteFindByDocumentPort;
    private final ContratanteSavePort contratanteSavePort;
    private final ContratanteUpdateRazonSocialPort contratanteUpdateRazonSocialPort;
    private final AseguradoFindByDocumentPort aseguradoFindByDocumentPort;
    private final AseguradoSavePort aseguradoSavePort;

    public TramiteService(TramiteFindAllPort tramiteFindAllPort, TramiteFindByIdPort tramiteFindByIdPort,
                          TramiteSavePort tramiteSavePort, ContratanteFindByDocumentPort contratanteFindByDocumentPort,
                          ContratanteSavePort contratanteSavePort, ContratanteUpdateRazonSocialPort contratanteUpdateRazonSocialPort,
                          AseguradoFindByDocumentPort aseguradoFindByDocumentPort, AseguradoSavePort aseguradoSavePort) {
        this.tramiteFindAllPort = tramiteFindAllPort;
        this.tramiteFindByIdPort = tramiteFindByIdPort;
        this.tramiteSavePort = tramiteSavePort;
        this.contratanteFindByDocumentPort = contratanteFindByDocumentPort;
        this.contratanteUpdateRazonSocialPort = contratanteUpdateRazonSocialPort;
        this.aseguradoFindByDocumentPort = aseguradoFindByDocumentPort;
        this.contratanteSavePort = contratanteSavePort;
        this.aseguradoSavePort = aseguradoSavePort;
    }


    @Override
    public void updateCondition(Long tramiteId, Integer conditionId) throws TramiteUseCaseException {

    }

    @Override
    public List<Tramite> findAll() throws TramiteUseCaseException {
        try {
            return tramiteFindAllPort.findAll();
        } catch (Exception e) {
            throw new TramiteUseCaseException(e.getMessage(), e.getCause());
        }
    }

    @Override
    public Tramite findById(Long id) throws TramiteUseCaseException {
        try {
            return tramiteFindByIdPort.findById(id).orElseThrow(
                    () -> new TramiteUseCaseException(TRAMITE_NO_ENCONTRADO));
        } catch (Exception e) {
            throw new TramiteUseCaseException(e.getMessage(), e.getCause());
        }
    }

    @Override
    public Tramite save(Tramite tramite) throws TramiteUseCaseException {
        try {
            //TODO: Busca al contratante, si no existe lo registra caso contrario SOLO actualizar la RAZON SOCIAL.
            Contratante contratante = this.validarContratante(tramite.getContratante());
            tramite.setContratante(contratante);
            tramite.setEstado(EstadoEnum.ACTIVO);
            if (Objects.isNull(tramite.getContratante().getId())) {
                Contratante contratanteSaved = contratanteSavePort.save(contratante);
                tramite.setContratante(contratanteSaved);
            }

            //TODO: Busca al asegurado por numero documento, si no existe lo registra, de lo contrario actualizar.
            Asegurado asegurado = this.validarAsegurado(tramite.getAsegurado());
            tramite.setAsegurado(asegurado);
            return tramiteSavePort.save(tramite);
        } catch (Exception e) {
            throw new TramiteUseCaseException(ERROR_GUARDAR_TRAMITE, e.getCause());
        }
    }

    private Asegurado validarAsegurado(Asegurado asegurado) {
        Optional<Asegurado> optionalAsegurado = aseguradoFindByDocumentPort.
                findByDocument(asegurado.getNumeroDocumento());
        optionalAsegurado.ifPresent(value -> asegurado.setId(value.getId()));
        asegurado.setEstado(EstadoEnum.ACTIVO);
        return aseguradoSavePort.save(asegurado);
    }

    private Contratante validarContratante(Contratante contratante) {
        Optional<Contratante> optionalContratante = contratanteFindByDocumentPort.
                findByDocument(contratante.getNumeroDocumento());
        optionalContratante.ifPresent(data -> {contratante.setId(data.getId());
            contratanteUpdateRazonSocialPort.updateRazonSocial(data.getId(), contratante.getRazonSocial());
        });
        contratante.setEstado(EstadoEnum.ACTIVO);
        return contratante;
    }
}
