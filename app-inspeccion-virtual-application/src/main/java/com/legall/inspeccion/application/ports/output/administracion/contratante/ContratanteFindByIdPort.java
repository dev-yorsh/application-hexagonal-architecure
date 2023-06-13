package com.legall.inspeccion.application.ports.output.administracion.contratante;

import com.legall.inspeccion.application.ports.output.administracion.contratante.exception.ContratanteExceptionPort;
import com.legall.inspeccion.domain.administracion.Contratante;

import java.util.Optional;

@FunctionalInterface
public interface ContratanteFindByIdPort {

    Optional<Contratante> findById(Long id) throws ContratanteExceptionPort;
}
