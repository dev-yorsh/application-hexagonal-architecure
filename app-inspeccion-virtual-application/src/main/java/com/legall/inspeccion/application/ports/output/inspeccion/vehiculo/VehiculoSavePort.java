package com.legall.inspeccion.application.ports.output.inspeccion.vehiculo;

import com.legall.inspeccion.application.ports.output.inspeccion.vehiculo.exception.VehiculoPortException;
import com.legall.inspeccion.domain.inspeccion.Vehiculo;

@FunctionalInterface
public interface VehiculoSavePort {

    Vehiculo save(Vehiculo vehiculo) throws VehiculoPortException;
}
