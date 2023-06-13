package com.legall.inspeccion.domain.administracion;

import com.legall.inspeccion.domain.base.EstadoEnum;

import java.time.LocalDateTime;

public final class Asegurado extends Persona {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String referenciaDomicilio;

    public Asegurado() {
        super();
    }

    public Asegurado(Long id, TipoDocumentoEnum tipoDocumentoId, String numeroDocumento, Integer distritoId,
                     String domicilio, String telefonoMovil, String telefonoFijo, String correo,
                     EstadoEnum estado, LocalDateTime fechaCreacion, String creadoPor,
                     LocalDateTime fechaModificacion, String modificadoPor, String nombre,
                     String apellidoPaterno, String apellidoMaterno, String referenciaDomicilio) {
        super(id, tipoDocumentoId, numeroDocumento, distritoId, domicilio, telefonoMovil, telefonoFijo, correo, estado, fechaCreacion, creadoPor, fechaModificacion, modificadoPor);
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.referenciaDomicilio = referenciaDomicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getReferenciaDomicilio() {
        return referenciaDomicilio;
    }

    public void setReferenciaDomicilio(String referenciaDomicilio) {
        this.referenciaDomicilio = referenciaDomicilio;
    }

    @Override
    public String toString() {
        return "Asegurado{" +
                "nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", referenciaDomicilio='" + referenciaDomicilio + '\'' +
                '}' + super.toString();
    }
}
