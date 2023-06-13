package com.legall.inspeccion.application.ports.input.administracion.marca;

import com.legall.inspeccion.application.ports.input.administracion.marca.exception.MarcaUseCaseException;
import com.legall.inspeccion.domain.administracion.Marca;

@FunctionalInterface
public interface MarcaFindByIdUseCase {

    Marca findById(Long id) throws MarcaUseCaseException;
}
