package com.legall.inspeccion.application.ports.input.administracion.asegurado;

import com.legall.inspeccion.application.ports.input.base.GlobalUseCaseException;
import com.legall.inspeccion.domain.administracion.Asegurado;

@FunctionalInterface
public interface AseguradoSaveUseCase {

    Asegurado save(Asegurado asegurado) throws GlobalUseCaseException;
}
