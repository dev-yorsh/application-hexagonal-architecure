package com.legall.inspeccion.adapter.output.database.entity.inspeccion.builder;

import com.legall.inspeccion.adapter.output.database.entity.inspeccion.VehiculoEntityPostgres;
import com.legall.inspeccion.domain.base.EstadoEnum;

public class VehiculoEntityBuilder {

    private VehiculoEntityPostgres vehiculoEntityPostgres;

    public VehiculoEntityBuilder() {
        this.vehiculoEntityPostgres = new VehiculoEntityPostgres();
    }

    public VehiculoEntityBuilder id(Long id) {
        this.vehiculoEntityPostgres.setVehiculoId(id);
        return this;
    }

    public VehiculoEntityBuilder placa(String placa) {
        this.vehiculoEntityPostgres.setPlaca(placa);
        return this;
    }

    public VehiculoEntityBuilder marcaId(Long marca) {
        this.vehiculoEntityPostgres.setMarcaId(marca);
        return this;
    }

    public VehiculoEntityBuilder modelo(String modelo) {
        this.vehiculoEntityPostgres.setModelo(modelo);
        return this;
    }

    public VehiculoEntityBuilder anio(Integer anio) {
        this.vehiculoEntityPostgres.setAnio(anio);
        return this;
    }

    public VehiculoEntityBuilder color(String color) {
        this.vehiculoEntityPostgres.setColor(color);
        return this;
    }

    public VehiculoEntityBuilder numeroMotor(String numeroMotor) {
        this.vehiculoEntityPostgres.setNumeroMotor(numeroMotor);
        return this;
    }

    public VehiculoEntityBuilder vin(String vin) {
        this.vehiculoEntityPostgres.setVin(vin);
        return this;
    }

    public VehiculoEntityBuilder numeroCilindro(Integer numeroCilindro) {
        this.vehiculoEntityPostgres.setNumeroCilindro(numeroCilindro);
        return this;
    }

    public VehiculoEntityBuilder numeroPuerta(Integer numeroPuerta) {
        this.vehiculoEntityPostgres.setNumeroPuerta(numeroPuerta);
        return this;
    }

    public VehiculoEntityBuilder kilometraje(Integer kilometraje) {
        this.vehiculoEntityPostgres.setKilometraje(kilometraje);
        return this;
    }

    public VehiculoEntityBuilder presentaDanios(Boolean presentaDanios) {
        this.vehiculoEntityPostgres.setPresentaDanios(presentaDanios);
        return this;
    }

    public VehiculoEntityBuilder detalleDanios(String detalleDanios) {
        this.vehiculoEntityPostgres.setDetalleDanios(detalleDanios);
        return this;
    }

    public VehiculoEntityBuilder observacion(String observacion) {
        this.vehiculoEntityPostgres.setObservacion(observacion);
        return this;
    }

    public VehiculoEntityBuilder estado(String estado) {
        this.vehiculoEntityPostgres.setEstado(estado);
        return this;
    }

    public VehiculoEntityPostgres build() {
        return this.vehiculoEntityPostgres;
    }
}
