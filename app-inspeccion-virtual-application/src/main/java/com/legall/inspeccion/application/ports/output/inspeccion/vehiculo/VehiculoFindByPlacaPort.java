package com.legall.inspeccion.application.ports.output.inspeccion.vehiculo;


import com.legall.inspeccion.application.ports.output.inspeccion.vehiculo.exception.VehiculoPortException;
import com.legall.inspeccion.domain.inspeccion.Vehiculo;

import java.util.Optional;

@FunctionalInterface
public interface VehiculoFindByPlacaPort {

    Optional<Vehiculo> findByPlaca(String placa) throws VehiculoPortException;
}
