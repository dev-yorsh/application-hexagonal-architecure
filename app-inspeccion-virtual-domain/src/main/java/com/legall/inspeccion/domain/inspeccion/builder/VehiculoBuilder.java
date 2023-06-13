package com.legall.inspeccion.domain.inspeccion.builder;

import com.legall.inspeccion.domain.base.EstadoEnum;
import com.legall.inspeccion.domain.inspeccion.Vehiculo;

public class VehiculoBuilder {

    private Vehiculo vehiculo;

    public VehiculoBuilder() {
        vehiculo = new Vehiculo();
    }

    public VehiculoBuilder id(Long id) {
        vehiculo.setId(id);
        return this;
    }

    public VehiculoBuilder placa(String placa) {
        vehiculo.setPlaca(placa);
        return this;
    }

    public VehiculoBuilder marcaId(Long marcaId) {
        vehiculo.setMarcaId(marcaId);
        return this;
    }

    public VehiculoBuilder modelo(String modelo) {
        vehiculo.setModelo(modelo);
        return this;
    }

    public VehiculoBuilder anio(Integer anio) {
        vehiculo.setAnio(anio);
        return this;
    }

    public VehiculoBuilder color(String color) {
        vehiculo.setColor(color);
        return this;
    }

    public VehiculoBuilder numeroMotor(String numeroMotor) {
        vehiculo.setNumeroMotor(numeroMotor);
        return this;
    }

    public VehiculoBuilder vin(String vin) {
        vehiculo.setVin(vin);
        return this;
    }

    public VehiculoBuilder numeroCilindro(Integer numeroCilindro) {
        vehiculo.setNumeroCilindros(numeroCilindro);
        return this;
    }

    public VehiculoBuilder numeroPuerta(Integer numeroPuerta) {
        vehiculo.setNumeroPuertas(numeroPuerta);
        return this;
    }

    public VehiculoBuilder kilometraje(Integer kilometraje) {
        vehiculo.setKilometraje(kilometraje);
        return this;
    }

    public VehiculoBuilder presentaDanios(Boolean presentaDanio) {
        vehiculo.setPresentaDanios(presentaDanio);
        return this;
    }

    public VehiculoBuilder detalleDanios(String detalleDanios) {
        vehiculo.setDetalleDanios(detalleDanios);
        return this;
    }

    public VehiculoBuilder observacion(String observacion) {
        vehiculo.setObservaciones(observacion);
        return this;
    }

    public VehiculoBuilder estado(EstadoEnum estadoEnum){
        vehiculo.setEstado(estadoEnum);
        return this;
    }

    public Vehiculo build() {
        return vehiculo;
    }
}
