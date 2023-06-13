package com.legall.inspeccion.domain.base;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract sealed class AuditoriaDomain permits BaseDomain {

    public String creadoPor;
    public LocalDateTime fechaCreacion;
    public String modificadoPor;
    public LocalDateTime fechaModificacion;

    public AuditoriaDomain() {
    }

    public AuditoriaDomain(LocalDateTime fechaCreacion, String creadoPor,
                           LocalDateTime fechaModificacion, String modificadoPor) {
        this.fechaCreacion = fechaCreacion;
        this.creadoPor = creadoPor;
        this.fechaModificacion = fechaModificacion;
        this.modificadoPor = modificadoPor;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getModificadoPor() {
        return modificadoPor;
    }

    public void setModificadoPor(String modificadoPor) {
        this.modificadoPor = modificadoPor;
    }

    @Override
    public String toString() {
        return "AuditoriaDomain[" +
                "fechaCreacion=" + fechaCreacion +
                ", creadoPor='" + creadoPor + '\'' +
                ", fechaModificacion=" + fechaModificacion +
                ", modificadoPor='" + modificadoPor + '\'' +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuditoriaDomain that = (AuditoriaDomain) o;
        return Objects.equals(fechaCreacion, that.fechaCreacion) && Objects.equals(creadoPor, that.creadoPor) && Objects.equals(fechaModificacion, that.fechaModificacion) && Objects.equals(modificadoPor, that.modificadoPor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaCreacion, creadoPor, fechaModificacion, modificadoPor);
    }
}
