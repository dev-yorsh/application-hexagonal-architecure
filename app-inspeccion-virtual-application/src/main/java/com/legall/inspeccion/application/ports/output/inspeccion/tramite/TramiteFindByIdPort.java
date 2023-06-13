package com.legall.inspeccion.application.ports.output.inspeccion.tramite;

import com.legall.inspeccion.application.ports.output.inspeccion.tramite.exception.TramiteExceptionPort;
import com.legall.inspeccion.domain.inspeccion.Tramite;

import java.util.Optional;

@FunctionalInterface
public interface TramiteFindByIdPort {

    Optional<Tramite> findById(Long id) throws TramiteExceptionPort;
}
