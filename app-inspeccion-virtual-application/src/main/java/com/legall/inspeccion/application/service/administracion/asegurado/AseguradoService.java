package com.legall.inspeccion.application.service.administracion.asegurado;

import com.legall.inspeccion.application.ports.input.administracion.asegurado.AseguradoSaveUseCase;
import com.legall.inspeccion.application.ports.input.administracion.asegurado.exception.AseguradoExceptionUseCase;
import com.legall.inspeccion.application.ports.input.base.GlobalUseCaseException;
import com.legall.inspeccion.application.ports.output.administracion.asegurado.AseguradoFindByDocumentPort;
import com.legall.inspeccion.application.ports.output.administracion.asegurado.AseguradoSavePort;
import com.legall.inspeccion.domain.administracion.Asegurado;

public class AseguradoService implements AseguradoSaveUseCase {

    private final AseguradoSavePort aseguradoSavePort;
    private final AseguradoFindByDocumentPort aseguradoFindByDocumentPort;

    public AseguradoService(AseguradoSavePort aseguradoSavePort, AseguradoFindByDocumentPort aseguradoFindByDocumentPort) {
        this.aseguradoSavePort = aseguradoSavePort;
        this.aseguradoFindByDocumentPort = aseguradoFindByDocumentPort;
    }

    @Override
    public Asegurado save(Asegurado asegurado) throws GlobalUseCaseException {
        try {
            return aseguradoSavePort.save(asegurado);
        } catch (Exception e) {
            throw new AseguradoExceptionUseCase(e.getMessage());
        }
    }
}
