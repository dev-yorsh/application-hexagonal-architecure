package com.legall.inspeccion.application.ports.output.administracion.asegurado;

import com.legall.inspeccion.application.ports.output.administracion.asegurado.exception.AseguradoExceptionPort;
import com.legall.inspeccion.domain.administracion.Asegurado;

@FunctionalInterface
public interface AseguradoSavePort {

    Asegurado save(Asegurado asegurado) throws AseguradoExceptionPort;

}
