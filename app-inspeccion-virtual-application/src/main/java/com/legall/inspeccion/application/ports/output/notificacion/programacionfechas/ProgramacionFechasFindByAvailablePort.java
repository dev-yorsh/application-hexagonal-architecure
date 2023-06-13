package com.legall.inspeccion.application.ports.output.notificacion.programacionfechas;

import com.legall.inspeccion.application.ports.output.notificacion.programacionfechas.exception.ProgramacionFechasExceptionPort;
import com.legall.inspeccion.domain.notificacion.ProgramacionFechas;

import java.util.Optional;

@FunctionalInterface
public interface ProgramacionFechasFindByAvailablePort {

    Optional<ProgramacionFechas> findByAvailable(String fechaFinalizacion, Long empleadoId, Boolean estaReservado)
            throws ProgramacionFechasExceptionPort;
}
