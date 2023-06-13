package com.legall.inspeccion.adapter.output.database.entity.administracion.builder;

import com.legall.inspeccion.adapter.output.database.entity.administracion.ContratanteEntityPostgres;

import java.time.LocalDateTime;

public class ContratanteEntityBuilder {

    private ContratanteEntityPostgres contratanteEntityPostgres;

    public ContratanteEntityBuilder() {
        this.contratanteEntityPostgres = new ContratanteEntityPostgres();
    }

    public ContratanteEntityBuilder contratanteId(Long id) {
        this.contratanteEntityPostgres.setContratanteId(id);
        return this;
    }

    public ContratanteEntityBuilder tipoDocumentoId(Integer tipoDocumento) {
        this.contratanteEntityPostgres.setTipoDocumentoId(tipoDocumento);
        return this;
    }

    public ContratanteEntityBuilder numeroDocumento(String numeroDocumento) {
        this.contratanteEntityPostgres.setNumeroDocumento(numeroDocumento);
        return this;
    }

    public ContratanteEntityBuilder razonSocial(String razonsocial) {
        this.contratanteEntityPostgres.setRazonSocial(razonsocial);
        return this;
    }

    public ContratanteEntityBuilder domicilio(String domicilio) {
        this.contratanteEntityPostgres.setDomicilio(domicilio);
        return this;
    }

    public ContratanteEntityBuilder distritoId(Integer distritoId) {
        this.contratanteEntityPostgres.setDistritoId(distritoId);
        return this;
    }

    public ContratanteEntityBuilder telefonoMovil(String telefonoMovil) {
        this.contratanteEntityPostgres.setTelefonoMovil(telefonoMovil);
        return this;
    }

    public ContratanteEntityBuilder telefonoFijo(String telefonoFijo) {
        this.contratanteEntityPostgres.setTelefonoFijo(telefonoFijo);
        return this;
    }

    public ContratanteEntityBuilder correo(String correoElectronico) {
        this.contratanteEntityPostgres.setCorreo(correoElectronico);
        return this;
    }

    public ContratanteEntityBuilder fechaCreacion(LocalDateTime fechaCreacion) {
        this.contratanteEntityPostgres.setFechaCreacion(fechaCreacion);
        return this;
    }

    public ContratanteEntityBuilder creadoPor(String creadoPor) {
        this.contratanteEntityPostgres.setCreadoPor(creadoPor);
        return this;
    }

    public ContratanteEntityBuilder modificadoPor(String modificadoPor) {
        this.contratanteEntityPostgres.setModificadoPor(modificadoPor);
        return this;
    }

    public ContratanteEntityBuilder fechaModificacion(LocalDateTime fechaModificacion) {
        this.contratanteEntityPostgres.setFechaModificacion(fechaModificacion);
        return this;
    }


    public ContratanteEntityBuilder estado(String estado) {
        this.contratanteEntityPostgres.setEstado(estado);
        return this;
    }

    public ContratanteEntityPostgres build() {
        return this.contratanteEntityPostgres;
    }

}
