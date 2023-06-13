package com.legall.inspeccion.application.ports.output.administracion.marca;

import com.legall.inspeccion.application.ports.output.administracion.marca.exception.MarcaExceptionPort;
import com.legall.inspeccion.domain.administracion.Marca;

import java.util.List;

@FunctionalInterface
public interface MarcaFindAllPort {

    List<Marca> findAll() throws MarcaExceptionPort;

}
