package com.legall.inspeccion.application.ports.output.notificacion.programacionfechas;

import com.legall.inspeccion.application.ports.output.notificacion.programacionfechas.exception.ProgramacionFechasExceptionPort;
import com.legall.inspeccion.domain.notificacion.ProgramacionFechas;

@FunctionalInterface
public interface ProgramacionFechasSavePort {

    ProgramacionFechas save(ProgramacionFechas programacionFechas) throws ProgramacionFechasExceptionPort;
}
