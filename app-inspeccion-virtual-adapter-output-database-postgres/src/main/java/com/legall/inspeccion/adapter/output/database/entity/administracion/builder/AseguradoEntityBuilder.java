package com.legall.inspeccion.adapter.output.database.entity.administracion.builder;

import com.legall.inspeccion.adapter.output.database.entity.administracion.AseguradoEntityPostgres;

import java.time.LocalDateTime;

public class AseguradoEntityBuilder {

    private AseguradoEntityPostgres aseguradoEntity;

    public AseguradoEntityBuilder() {
        aseguradoEntity = new AseguradoEntityPostgres();
    }

    public AseguradoEntityBuilder aseguradoId(Long id) {
        aseguradoEntity.setAseguradoId(id);
        return this;
    }

    public AseguradoEntityBuilder tipoDocumentoId(Integer tipoDocumentoId) {
        aseguradoEntity.setTipoDocumentoId(tipoDocumentoId);
        return this;
    }

    public AseguradoEntityBuilder numeroDocumento(String numeroDocumento) {
        aseguradoEntity.setNumeroDocumento(numeroDocumento);
        return this;
    }

    public AseguradoEntityBuilder nombre(String nombre) {
        aseguradoEntity.setNombre(nombre);
        return this;
    }

    public AseguradoEntityBuilder apellidoPaterno(String apellidoPaterno) {
        aseguradoEntity.setApellidoPaterno(apellidoPaterno);
        return this;
    }

    public AseguradoEntityBuilder apellidoMaterno(String apellidoMaterno) {
        aseguradoEntity.setApellidoMaterno(apellidoMaterno);
        return this;
    }

    public AseguradoEntityBuilder domicilio(String domicilio) {
        aseguradoEntity.setDomicilio(domicilio);
        return this;
    }

    public AseguradoEntityBuilder referenciaDomicilio(String referenciaDomicilio) {
        aseguradoEntity.setReferenciaDomicilio(referenciaDomicilio);
        return this;
    }

    public AseguradoEntityBuilder distritoId(Integer distritoId) {
        aseguradoEntity.setDistritoId(distritoId);
        return this;
    }

    public AseguradoEntityBuilder telefonoMovil(String telefonoMovil) {
        aseguradoEntity.setTelefonoMovil(telefonoMovil);
        return this;
    }

    public AseguradoEntityBuilder telefonoFijo(String telefonoFijo) {
        aseguradoEntity.setTelefonoFijo(telefonoFijo);
        return this;
    }

    public AseguradoEntityBuilder correo(String correo) {
        aseguradoEntity.setCorreo(correo);
        return this;
    }

    public AseguradoEntityBuilder fechaCreacion(LocalDateTime fechaCreacion) {
        aseguradoEntity.setFechaCreacion(fechaCreacion);
        return this;
    }

    public AseguradoEntityBuilder creadoPor(String usuarioCreacion) {
        aseguradoEntity.setCreadoPor(usuarioCreacion);
        return this;
    }

    public AseguradoEntityBuilder fechaModificacion(LocalDateTime fechaModificacion) {
        aseguradoEntity.setFechaModificacion(fechaModificacion);
        return this;
    }

    public AseguradoEntityBuilder modificadoPor(String usuarioModificacion) {
        aseguradoEntity.setModificadoPor(usuarioModificacion);
        return this;
    }


    public AseguradoEntityBuilder estado(String estado) {
        aseguradoEntity.setEstado(estado);
        return this;
    }

    public AseguradoEntityPostgres build() {
        return aseguradoEntity;
    }
}
