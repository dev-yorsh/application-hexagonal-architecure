package com.legall.inspeccion.domain.inspeccion;

import com.legall.inspeccion.domain.base.BaseDomain;
import com.legall.inspeccion.domain.base.EstadoEnum;
import com.legall.inspeccion.domain.constantes.MensajeConstante;
import com.legall.inspeccion.domain.inspeccion.exception.InspeccionException;

import java.time.LocalDateTime;

public final class Inspeccion extends BaseDomain {

    private String codigoInspeccion;
    private Long tramiteId;
    private Vehiculo vehiculo;
    EstadoInspeccionEnum estadoInspeccion;
    private String observacion;
    private String fechaReservaInspeccion;

    public Inspeccion() {
        super();
    }

    public Inspeccion(Long id, String codigoInspeccion, Long tramiteId, Vehiculo vehiculo,
                      EstadoInspeccionEnum estadoInspeccion, String observacion,
                      EstadoEnum estado, LocalDateTime fechaCreacion, String creadoPor,
                      LocalDateTime fechaModificacion, String modificadoPor) {
        super(id, estado, fechaCreacion, creadoPor, fechaModificacion, modificadoPor);
        this.codigoInspeccion = codigoInspeccion;
        this.tramiteId = tramiteId;
        this.vehiculo = vehiculo;
        this.estadoInspeccion = estadoInspeccion;
        this.observacion = observacion;
    }

    public void validarVehiculo() throws InspeccionException {
        validarObjetoNulo(vehiculo, MensajeConstante.MENSAJE_VEHICULO_NULO);
    }

    public String getCodigoInspeccion() {
        return codigoInspeccion;
    }

    public void setCodigoInspeccion(String codigoInspeccion) {
        this.codigoInspeccion = codigoInspeccion;
    }

    public Long getTramiteId() {
        return tramiteId;
    }

    public void setTramiteId(Long tramiteId) {
        this.tramiteId = tramiteId;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public EstadoInspeccionEnum getEstadoInspeccion() {
        return estadoInspeccion;
    }

    public void setEstadoInspeccion(EstadoInspeccionEnum estadoInspeccion) {
        this.estadoInspeccion = estadoInspeccion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    private void validarObjetoNulo(Object objeto, String mensaje) throws InspeccionException {
        if (objeto == null) {
            throw new InspeccionException(mensaje);
        }
    }

    public String getFechaReservaInspeccion() {
        return fechaReservaInspeccion;
    }

    public void setFechaReservaInspeccion(String fechaReservaInspeccion) {
        this.fechaReservaInspeccion = fechaReservaInspeccion;
    }

    @Override
    public String toString() {
        return "Inspeccion{" +
                "codigoInspeccion='" + codigoInspeccion + '\'' +
                ", tramiteId=" + tramiteId +
                ", vehiculo=" + vehiculo +
                ", estadoInspeccion=" + estadoInspeccion +
                ", observacion='" + observacion + '\'' +
                '}' + super.toString();
    }
}