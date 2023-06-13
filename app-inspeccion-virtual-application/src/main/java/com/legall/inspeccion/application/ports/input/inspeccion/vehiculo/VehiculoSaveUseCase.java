package com.legall.inspeccion.application.ports.input.inspeccion.vehiculo;

import com.legall.inspeccion.application.ports.input.inspeccion.vehiculo.exception.VehiculoUseCaseException;
import com.legall.inspeccion.domain.inspeccion.Vehiculo;

@FunctionalInterface
public interface VehiculoSaveUseCase {

    Vehiculo save(Vehiculo vehiculo) throws VehiculoUseCaseException;
}
