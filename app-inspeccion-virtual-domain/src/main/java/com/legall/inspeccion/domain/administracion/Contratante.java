package com.legall.inspeccion.domain.administracion;

import com.legall.inspeccion.domain.base.EstadoEnum;

import java.time.LocalDateTime;

public final class Contratante extends Persona {

    private String razonSocial;

    public Contratante() {
        super();
    }

    public Contratante(Long id, TipoDocumentoEnum tipoDocumentoId, String numeroDocumento,
                       Integer distritoId, String domicilio, String telefonoMovil, String telefonoFijo,
                       String correo, EstadoEnum estado, LocalDateTime fechaCreacion, String creadoPor,
                       LocalDateTime fechaModificacion, String modificadoPor, String razonSocial) {
        super(id, tipoDocumentoId, numeroDocumento, distritoId, domicilio, telefonoMovil, telefonoFijo,
                correo, estado, fechaCreacion, creadoPor, fechaModificacion, modificadoPor);

        this.razonSocial = razonSocial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public String toString() {
        return "Contratante{" +
                "razonSocial='" + razonSocial + '\'' +
                '}' + super.toString();
    }
}
