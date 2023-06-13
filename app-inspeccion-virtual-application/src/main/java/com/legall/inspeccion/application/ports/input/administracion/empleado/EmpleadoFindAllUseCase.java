package com.legall.inspeccion.application.ports.input.administracion.empleado;

import com.legall.inspeccion.application.ports.input.base.GlobalUseCaseException;
import com.legall.inspeccion.domain.administracion.Empleado;

import java.util.List;

@FunctionalInterface
public interface EmpleadoFindAllUseCase {

    List<Empleado> findAll() throws GlobalUseCaseException;
}
