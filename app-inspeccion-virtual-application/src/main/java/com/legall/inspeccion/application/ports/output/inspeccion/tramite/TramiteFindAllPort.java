package com.legall.inspeccion.application.ports.output.inspeccion.tramite;

import com.legall.inspeccion.application.ports.output.inspeccion.tramite.exception.TramiteExceptionPort;
import com.legall.inspeccion.domain.inspeccion.Tramite;

import java.util.List;

@FunctionalInterface
public interface TramiteFindAllPort {

    List<Tramite> findAll() throws TramiteExceptionPort;
}
