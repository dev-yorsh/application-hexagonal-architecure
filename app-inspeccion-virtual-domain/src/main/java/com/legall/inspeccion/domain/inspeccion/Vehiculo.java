package com.legall.inspeccion.domain.inspeccion;

import com.legall.inspeccion.domain.administracion.Marca;
import com.legall.inspeccion.domain.base.BaseDomain;
import com.legall.inspeccion.domain.base.EstadoEnum;

import java.time.LocalDateTime;

public final class Vehiculo extends BaseDomain {

    private Long marcaId;
    private String placa;
    private String modelo;
    private Integer anio;
    private String color;
    private String numeroMotor;
    private String vin;
    private Integer numeroCilindros;
    private Integer numeroPuertas;
    private Integer kilometraje;
    private Boolean presentaDanios;
    private String detalleDanios;
    private String observaciones;

    public Vehiculo() {
    }

    public Vehiculo(Long id, Long marcaId, String placa, String modelo, Integer anio, String color,
                    String numeroMotor, String vin, Integer numeroCilindros, Integer numeroPuertas,
                    Integer kilometraje, Boolean presentaDanios, String detalleDanios, String observaciones,
                    EstadoEnum estado, LocalDateTime fechaCreacion, String creadoPor,
                    LocalDateTime fechaModificacion, String modificadoPor) {
        super(id, estado, fechaCreacion, creadoPor, fechaModificacion, modificadoPor);
        this.placa = placa;
        this.marcaId = marcaId;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.numeroMotor = numeroMotor;
        this.vin = vin;
        this.numeroCilindros = numeroCilindros;
        this.numeroPuertas = numeroPuertas;
        this.kilometraje = kilometraje;
        this.presentaDanios = presentaDanios;
        this.detalleDanios = detalleDanios;
        this.observaciones = observaciones;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getNumeroCilindros() {
        return numeroCilindros;
    }

    public void setNumeroCilindros(Integer numeroCilindros) {
        this.numeroCilindros = numeroCilindros;
    }

    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Integer getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Integer kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Boolean getPresentaDanios() {
        return presentaDanios;
    }

    public void setPresentaDanios(Boolean presentaDanios) {
        this.presentaDanios = presentaDanios;
    }

    public String getDetalleDanios() {
        return detalleDanios;
    }

    public void setDetalleDanios(String detalleDanios) {
        this.detalleDanios = detalleDanios;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Long getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Long marca) {
        this.marcaId = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marcaId='" + marcaId + '\'' +
                ", modelo=" + modelo +
                ", anio=" + anio +
                ", color='" + color + '\'' +
                ", numeroMotor='" + numeroMotor + '\'' +
                ", vin='" + vin + '\'' +
                ", numeroCilindros=" + numeroCilindros +
                ", numeroPuertas=" + numeroPuertas +
                ", kilometraje=" + kilometraje +
                ", presentaDanios=" + presentaDanios +
                ", detalleDanios='" + detalleDanios + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}' + super.toString();
    }
}
