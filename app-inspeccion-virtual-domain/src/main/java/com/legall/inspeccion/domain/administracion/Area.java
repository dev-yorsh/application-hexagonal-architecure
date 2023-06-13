package com.legall.inspeccion.domain.administracion;

import com.legall.inspeccion.domain.base.BaseDomain;
import com.legall.inspeccion.domain.base.EstadoEnum;

public final class Area extends BaseDomain {

    private String nombre;
    private String descripcion;
    private String prefijo;

    public Area() {
    }

    public Area(Long id, String nombre, String descripcion, String prefijo, EstadoEnum estado) {
        super(id, estado);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prefijo = prefijo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    @Override
    public String toString() {
        return "Area{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", prefijo='" + prefijo + '\'' +
                '}' + super.toString();
    }
}
