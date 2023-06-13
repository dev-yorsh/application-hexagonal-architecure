package com.legall.inspeccion.domain.inspeccion.builder;

import com.legall.inspeccion.domain.base.EstadoEnum;
import com.legall.inspeccion.domain.inspeccion.EstadoInspeccionEnum;
import com.legall.inspeccion.domain.inspeccion.Inspeccion;
import com.legall.inspeccion.domain.inspeccion.Vehiculo;

public class InspeccionBuilder {

    private Inspeccion inspeccion;

    public InspeccionBuilder() {
        this.inspeccion = new Inspeccion();
    }

    public InspeccionBuilder id(Long id) {
        this.inspeccion.setId(id);
        return this;
    }

    public InspeccionBuilder tramiteId(Long tramiteId) {
        this.inspeccion.setTramiteId(tramiteId);
        return this;
    }

    public InspeccionBuilder codigoInspeccion(String codigoInspeccion) {
        this.inspeccion.setCodigoInspeccion(codigoInspeccion);
        return this;
    }

    public InspeccionBuilder observacion(String observacion) {
        this.inspeccion.setObservacion(observacion);
        return this;
    }

    public InspeccionBuilder estadoInspeccion(EstadoInspeccionEnum estadoInspeccion) {
        this.inspeccion.setEstadoInspeccion(estadoInspeccion);
        return this;
    }

    public InspeccionBuilder estado(EstadoEnum estado) {
        this.inspeccion.setEstado(estado);
        return this;
    }

    public InspeccionBuilder vehiculo(Vehiculo vehiculo) {
        this.inspeccion.setVehiculo(vehiculo);
        return this;
    }

    public Inspeccion build() {
        return this.inspeccion;
    }
}
