package com.legall.inspeccion.application.ports.input.notificacion.pregramacionfecha;

import com.legall.inspeccion.application.ports.input.notificacion.pregramacionfecha.exception.ProgramacionFechasUseCaseExecption;
import com.legall.inspeccion.domain.notificacion.ProgramacionFechas;

@FunctionalInterface
public interface ProgramacionFechaReservarUseCase {

        ProgramacionFechas reservarFecha(ProgramacionFechas programacionFechas)
                throws ProgramacionFechasUseCaseExecption;
}
