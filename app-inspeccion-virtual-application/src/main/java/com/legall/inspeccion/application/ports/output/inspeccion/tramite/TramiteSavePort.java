package com.legall.inspeccion.application.ports.output.inspeccion.tramite;

import com.legall.inspeccion.application.ports.output.inspeccion.tramite.exception.TramiteExceptionPort;
import com.legall.inspeccion.domain.inspeccion.Tramite;

@FunctionalInterface
public interface TramiteSavePort {

    Tramite save(Tramite tramite) throws TramiteExceptionPort;
}
