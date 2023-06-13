package com.legall.inspeccion.domain.administracion;

import com.legall.inspeccion.domain.base.BaseDomain;
import com.legall.inspeccion.domain.base.EstadoEnum;

import java.time.LocalDateTime;

public abstract sealed class Persona extends BaseDomain permits Contratante, Asegurado, Empleado {

    private TipoDocumentoEnum tipoDocumentoId;
    private String numeroDocumento;
    private Integer distritoId;
    private String domicilio;
    private String telefonoMovil;
    private String telefonoFijo;
    private String correo;

    public Persona() {
        super();
    }

    public Persona(Long id, TipoDocumentoEnum tipoDocumentoId, String numeroDocumento,
                   Integer distritoId, String domicilio, String telefonoMovil, String telefonoFijo,
                   String correo, EstadoEnum estado, LocalDateTime fechaCreacion, String creadoPor,
                   LocalDateTime fechaModificacion, String modificadoPor) {

        super(id, estado, fechaCreacion, creadoPor, fechaModificacion, modificadoPor);
        this.tipoDocumentoId = tipoDocumentoId;
        this.numeroDocumento = numeroDocumento;
        this.distritoId = distritoId;
        this.domicilio = domicilio;
        this.telefonoMovil = telefonoMovil;
        this.telefonoFijo = telefonoFijo;
        this.correo = correo;
    }

    public TipoDocumentoEnum getTipoDocumentoId() {
        return tipoDocumentoId;
    }

    public void setTipoDocumentoId(TipoDocumentoEnum tipoDocumentoId) {
        this.tipoDocumentoId = tipoDocumentoId;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Integer getDistritoId() {
        return distritoId;
    }

    public void setDistritoId(Integer distritoId) {
        this.distritoId = distritoId;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "tipoDocumentoId=" + tipoDocumentoId +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", distritoId=" + distritoId +
                ", domicilio='" + domicilio + '\'' +
                ", telefonoMovil='" + telefonoMovil + '\'' +
                ", telefonoFijo='" + telefonoFijo + '\'' +
                ", correo='" + correo + '\'' +
                '}' + super.toString();
    }
}
