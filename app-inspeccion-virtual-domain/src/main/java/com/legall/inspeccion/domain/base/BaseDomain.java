package com.legall.inspeccion.domain.base;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract non-sealed class BaseDomain extends AuditoriaDomain {

    private Long id;
    private EstadoEnum estado;

    public BaseDomain() {
        super();
    }

    public BaseDomain(Long id) {
        this.id = id;
    }

    public BaseDomain(Long id, EstadoEnum estado) {
        this.id = id;
        this.estado = estado;
    }

    public BaseDomain(Long id, EstadoEnum estado, LocalDateTime fechaCreacion, String creadoPor,
                      LocalDateTime fechaModificacion, String modificadoPor) {
        super(fechaCreacion, creadoPor, fechaModificacion, modificadoPor);
        this.id = id;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EstadoEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoEnum estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "BaseDomain[" +
                "id=" + id +
                ", estado=" + estado +
                ']' + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseDomain that = (BaseDomain) o;
        return Objects.equals(id, that.id) && estado == that.estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, estado);
    }
}
