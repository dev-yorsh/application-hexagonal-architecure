package com.legall.inspeccion.application.ports.output.inspeccion.inspeccion;

import com.legall.inspeccion.application.ports.output.inspeccion.inspeccion.exception.InspeccionPortException;
import com.legall.inspeccion.domain.inspeccion.Inspeccion;

@FunctionalInterface
public interface InspeccionSavePort {

    Inspeccion save(Inspeccion inspeccion) throws InspeccionPortException;
}
