package com.legall.inspeccion.application.ports.input.inspeccion.tramite;

import com.legall.inspeccion.application.ports.input.inspeccion.tramite.exception.TramiteUseCaseException;
import com.legall.inspeccion.domain.inspeccion.Tramite;

import java.util.List;

@FunctionalInterface
public interface TramiteFinAllUseCase {

    List<Tramite> findAll() throws TramiteUseCaseException;
}
