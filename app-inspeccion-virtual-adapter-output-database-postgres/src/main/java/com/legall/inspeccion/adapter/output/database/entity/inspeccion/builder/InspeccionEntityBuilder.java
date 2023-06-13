package com.legall.inspeccion.adapter.output.database.entity.inspeccion.builder;

import com.legall.inspeccion.adapter.output.database.entity.inspeccion.InspeccionEntityPostgres;
import com.legall.inspeccion.adapter.output.database.entity.inspeccion.VehiculoEntityPostgres;

public class InspeccionEntityBuilder {

    private InspeccionEntityPostgres inspeccionEntityPostgres;

    public InspeccionEntityBuilder() {
        this.inspeccionEntityPostgres = new InspeccionEntityPostgres();
    }

    public InspeccionEntityBuilder id(Long id) {
        this.inspeccionEntityPostgres.setInspeccionId(id);
        return this;
    }

    public InspeccionEntityBuilder tramiteId(Long tramiteId) {
        this.inspeccionEntityPostgres.setTramiteId(tramiteId);
        return this;
    }

    public InspeccionEntityBuilder vehiculo(VehiculoEntityPostgres vehiculo) {
        this.inspeccionEntityPostgres.setVehiculo(vehiculo);
        return this;
    }

    public InspeccionEntityBuilder codigoInspeccion(String codigoInspeccion) {
        this.inspeccionEntityPostgres.setCodigoInspeccion(codigoInspeccion);
        return this;
    }

    public InspeccionEntityBuilder estadoInspeccionId(Integer estadoInspeccionId) {
        this.inspeccionEntityPostgres.setEstadoInspeccionId(estadoInspeccionId);
        return this;
    }

    public InspeccionEntityBuilder observacion(String observacion) {
        this.inspeccionEntityPostgres.setObservacion(observacion);
        return this;
    }

    public InspeccionEntityBuilder estado(String estado) {
        this.inspeccionEntityPostgres.setEstado(estado);
        return this;
    }

    public InspeccionEntityPostgres build() {
        return this.inspeccionEntityPostgres;
    }

}
