package com.legall.inspeccion.application.ports.input.administracion.marca;

import com.legall.inspeccion.application.ports.input.administracion.marca.exception.MarcaUseCaseException;
import com.legall.inspeccion.domain.administracion.Marca;

import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
public interface MarcaFilterUseCase {

    List<Marca> findAllAndFilter(List<Marca> listaMarcas, Predicate<Marca> predicate) throws MarcaUseCaseException;
}
