package com.legall.inspeccion.application.ports.output.notificacion.programacionfechas;

import com.legall.inspeccion.domain.notificacion.ProgramacionFechas;

import java.util.List;

@FunctionalInterface
public interface ProgramacionFechaFindAllAvailablePort {

    List<ProgramacionFechas> findAllAvailable();
}
