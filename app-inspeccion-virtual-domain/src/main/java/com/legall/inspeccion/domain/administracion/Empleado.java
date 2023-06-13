package com.legall.inspeccion.domain.administracion;

import com.legall.inspeccion.domain.base.EstadoEnum;

import java.time.LocalDateTime;

public final class Empleado extends Persona {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public Empleado() {
    }

    public Empleado(Long id, TipoDocumentoEnum tipoDocumentoId, String numeroDocumento, String nombre,
                    String apellidoPaterno, String apellidoMaterno, Integer distritoId,
                    String domicilio, String telefonoMovil, String telefonoFijo, String correo,
                    LocalDateTime fechaCreacion, String creadoPor, LocalDateTime fechaModificacion,
                    String modificadoPor, EstadoEnum estado) {
        super(id, tipoDocumentoId, numeroDocumento, distritoId, domicilio, telefonoMovil, telefonoFijo, correo, estado, fechaCreacion, creadoPor, fechaModificacion, modificadoPor);
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                '}' + super.toString();
    }
}
