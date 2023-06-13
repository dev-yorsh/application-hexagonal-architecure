package com.legall.inspeccion.application.ports.output.administracion.marca;

import com.legall.inspeccion.domain.administracion.Marca;

import java.util.Optional;

@FunctionalInterface
public interface MarcaFindByIdPort {

    Optional<Marca> marcaFindById(Long id);
}
