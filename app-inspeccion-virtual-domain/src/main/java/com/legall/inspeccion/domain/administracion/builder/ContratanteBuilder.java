package com.legall.inspeccion.domain.administracion.builder;

import com.legall.inspeccion.domain.administracion.Contratante;
import com.legall.inspeccion.domain.administracion.TipoDocumentoEnum;
import com.legall.inspeccion.domain.base.EstadoEnum;

import java.time.LocalDateTime;

public class ContratanteBuilder {

    private Contratante contratante;

    public ContratanteBuilder() {
        this.contratante = new Contratante();
    }

    public ContratanteBuilder id(Long id) {
        this.contratante.setId(id);
        return this;
    }

    public ContratanteBuilder razonSocial(String razonSocial) {
        this.contratante.setRazonSocial(razonSocial);
        return this;
    }

    public ContratanteBuilder tipoDocumentoId(TipoDocumentoEnum tipoDocumento) {
        this.contratante.setTipoDocumentoId(tipoDocumento);
        return this;
    }

    public ContratanteBuilder numeroDocumento(String numeroDocumento) {
        this.contratante.setNumeroDocumento(numeroDocumento);
        return this;
    }

    public ContratanteBuilder distritoId(Integer distritoId) {
        this.contratante.setDistritoId(distritoId);
        return this;
    }

    public ContratanteBuilder domicilio(String domicilio) {
        this.contratante.setDomicilio(domicilio);
        return this;
    }

    public ContratanteBuilder telefonoMovil(String telefonoMovil) {
        this.contratante.setTelefonoMovil(telefonoMovil);
        return this;
    }

    public ContratanteBuilder telefonoFijo(String telefonoFijo) {
        this.contratante.setTelefonoFijo(telefonoFijo);
        return this;
    }

    public ContratanteBuilder correo(String correo) {
        this.contratante.setCorreo(correo);
        return this;
    }

    public ContratanteBuilder creadoPor(String creadoPor) {
        this.contratante.setCreadoPor(creadoPor);
        return this;
    }

    public ContratanteBuilder fechaCreacion(LocalDateTime fechaCreacion) {
        this.contratante.setFechaCreacion(fechaCreacion);
        return this;
    }

    public ContratanteBuilder modificadoPor(String modificadoPor) {
        this.contratante.setModificadoPor(modificadoPor);
        return this;
    }

    public ContratanteBuilder fechaModificacion(LocalDateTime modificadoPor) {
        this.contratante.setFechaModificacion(modificadoPor);
        return this;
    }


    public ContratanteBuilder estado(EstadoEnum estado) {
        this.contratante.setEstado(estado);
        return this;
    }

    public Contratante build() {
        return this.contratante;
    }

}
