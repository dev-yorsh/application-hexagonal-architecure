package com.legall.inspeccion.application.service.administracion.contratante;

import com.legall.inspeccion.application.ports.input.administracion.contratante.ContratanteSaveUseCase;
import com.legall.inspeccion.application.ports.input.administracion.contratante.exception.ContratanteExceptionUseCase;
import com.legall.inspeccion.application.ports.output.administracion.contratante.ContratanteFindByDocumentPort;
import com.legall.inspeccion.application.ports.output.administracion.contratante.ContratanteFindByIdPort;
import com.legall.inspeccion.application.ports.output.administracion.contratante.ContratanteSavePort;
import com.legall.inspeccion.domain.administracion.Contratante;

public class ContratanteService implements ContratanteSaveUseCase {

    private final ContratanteSavePort contratanteSavePort;
    private final ContratanteFindByIdPort contratanteFindByIdPort;
    private final ContratanteFindByDocumentPort contratanteFindByDocumentPort;

    public ContratanteService(ContratanteSavePort contratanteSavePort, ContratanteFindByIdPort contratanteFindByIdPort, ContratanteFindByDocumentPort contratanteFindByDocumentPort) {
        this.contratanteSavePort = contratanteSavePort;
        this.contratanteFindByIdPort = contratanteFindByIdPort;
        this.contratanteFindByDocumentPort = contratanteFindByDocumentPort;
    }

    @Override
    public Contratante save(Contratante contratante) throws ContratanteExceptionUseCase {
        try {
            return contratanteSavePort.save(contratante);
        } catch (Exception e) {
            throw new ContratanteExceptionUseCase(e.getMessage());
        }
    }
}
