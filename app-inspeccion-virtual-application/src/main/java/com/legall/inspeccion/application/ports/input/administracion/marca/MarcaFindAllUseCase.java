package com.legall.inspeccion.application.ports.input.administracion.marca;

import com.legall.inspeccion.application.ports.input.administracion.marca.exception.MarcaUseCaseException;
import com.legall.inspeccion.domain.administracion.Marca;

import java.util.List;

@FunctionalInterface
public interface MarcaFindAllUseCase {

    List<Marca> findAll() throws MarcaUseCaseException;
}
