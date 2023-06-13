package com.legall.inspeccion.domain.administracion;

import com.legall.inspeccion.domain.base.BaseDomain;
import com.legall.inspeccion.domain.base.EstadoEnum;

import java.time.LocalDateTime;

public final class Marca extends BaseDomain {

    private String nombre;
    private String prefijo;

    public Marca(String nombre, String prefijo) {
        this.nombre = nombre;
        this.prefijo = prefijo;
    }

    public Marca(Long id, String nombre, String prefijo) {
        super(id);
        this.nombre = nombre;
        this.prefijo = prefijo;
    }

    public Marca(Long id, String nombre, String prefijo, EstadoEnum estado) {
        super(id, estado);
        this.nombre = nombre;
        this.prefijo = prefijo;
    }

    // Validaciones
    public Marca(Long id, String nombre, String prefijo, EstadoEnum estado, LocalDateTime fechaCreacion,
                 String creadoPor, LocalDateTime fechaModificacion, String modificadoPor) {
        super(id, estado, fechaCreacion, creadoPor, fechaModificacion, modificadoPor);
        this.nombre = nombre;
        this.prefijo = prefijo;
    }

    public static Boolean nameIsInvalid(String nombreMarca) {
        return nombreMarca == null || nombreMarca.trim().isEmpty();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nombre='" + nombre + '\'' +
                ", prefijo='" + prefijo + '\'' +
                '}' + super.toString();
    }
}
