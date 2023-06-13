package com.legall.inspeccion.application.ports.input.inspeccion.vehiculo;

import com.legall.inspeccion.application.ports.input.inspeccion.vehiculo.exception.VehiculoUseCaseException;
import com.legall.inspeccion.domain.inspeccion.Vehiculo;

@FunctionalInterface
public interface VehiculoFindByPlacaUseCase {

    Vehiculo findByPlaca(String placa) throws VehiculoUseCaseException;
}
