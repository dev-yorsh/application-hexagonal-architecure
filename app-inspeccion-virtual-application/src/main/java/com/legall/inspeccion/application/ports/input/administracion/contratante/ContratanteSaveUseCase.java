package com.legall.inspeccion.application.ports.input.administracion.contratante;

import com.legall.inspeccion.application.ports.input.administracion.contratante.exception.ContratanteExceptionUseCase;
import com.legall.inspeccion.domain.administracion.Contratante;

@FunctionalInterface
public interface ContratanteSaveUseCase {

    Contratante save(Contratante contratante) throws ContratanteExceptionUseCase;
}
