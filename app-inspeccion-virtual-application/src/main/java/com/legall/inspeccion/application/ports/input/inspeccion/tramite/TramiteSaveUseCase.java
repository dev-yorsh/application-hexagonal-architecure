package com.legall.inspeccion.application.ports.input.inspeccion.tramite;

import com.legall.inspeccion.application.ports.input.inspeccion.tramite.exception.TramiteUseCaseException;
import com.legall.inspeccion.domain.inspeccion.Tramite;

@FunctionalInterface
public interface TramiteSaveUseCase {

    Tramite save(Tramite tramite) throws TramiteUseCaseException;
}
