package com.legall.inspeccion.application.ports.output.administracion.marca;

import com.legall.inspeccion.application.ports.output.administracion.marca.exception.MarcaExceptionPort;
import com.legall.inspeccion.domain.administracion.Marca;

@FunctionalInterface
public interface MarcaSavePort {

    Marca save(Marca marca) throws MarcaExceptionPort;
}
