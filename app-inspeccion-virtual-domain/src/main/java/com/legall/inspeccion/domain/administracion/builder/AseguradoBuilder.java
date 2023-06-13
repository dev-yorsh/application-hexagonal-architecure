package com.legall.inspeccion.domain.administracion.builder;

import com.legall.inspeccion.domain.administracion.Asegurado;
import com.legall.inspeccion.domain.administracion.TipoDocumentoEnum;
import com.legall.inspeccion.domain.base.EstadoEnum;

import java.time.LocalDateTime;

public class AseguradoBuilder {

    private Asegurado asegurado;

    public AseguradoBuilder() {
        asegurado = new Asegurado();
    }

    public AseguradoBuilder id(Long id) {
        asegurado.setId(id);
        return this;
    }

    public AseguradoBuilder nombre(String nombre) {
        asegurado.setNombre(nombre);
        return this;
    }

    public AseguradoBuilder apellidoPaterno(String apellidoPaterno) {
        asegurado.setApellidoPaterno(apellidoPaterno);
        return this;
    }

    public AseguradoBuilder apellidoMaterno(String apellidoMaterno) {
        asegurado.setApellidoMaterno(apellidoMaterno);
        return this;
    }

    public AseguradoBuilder referenciaDomicilio(String referenciaDomicilio) {
        asegurado.setReferenciaDomicilio(referenciaDomicilio);
        return this;
    }

    public AseguradoBuilder tipoDocumentoId(TipoDocumentoEnum tipoDocumentoId) {
        asegurado.setTipoDocumentoId(tipoDocumentoId);
        return this;
    }

    public AseguradoBuilder numeroDocumento(String numeroDocumento) {
        asegurado.setNumeroDocumento(numeroDocumento);
        return this;
    }

    public AseguradoBuilder distritoId(Integer distritoId) {
        asegurado.setDistritoId(distritoId);
        return this;
    }

    public AseguradoBuilder domicilio(String domicilio) {
        asegurado.setDomicilio(domicilio);
        return this;
    }

    public AseguradoBuilder telefonoMovil(String telefonoMovil) {
        asegurado.setTelefonoMovil(telefonoMovil);
        return this;
    }

    public AseguradoBuilder telefonoFijo(String telefonoFijo) {
        asegurado.setTelefonoFijo(telefonoFijo);
        return this;
    }

    public AseguradoBuilder correo(String correo) {
        asegurado.setCorreo(correo);
        return this;
    }

    public AseguradoBuilder fechaCreacion(LocalDateTime fechaCreacion) {
        asegurado.setFechaCreacion(fechaCreacion);
        return this;
    }

    public AseguradoBuilder creadoPor(String creadoPor) {
        asegurado.setCreadoPor(creadoPor);
        return this;
    }

    public AseguradoBuilder modificadoPor(String modificadoPor) {
        asegurado.setModificadoPor(modificadoPor);
        return this;
    }

    public AseguradoBuilder fechaModificacion(LocalDateTime fechaModificacion) {
        asegurado.setFechaModificacion(fechaModificacion);
        return this;
    }

    public AseguradoBuilder estado(EstadoEnum estado) {
        asegurado.setEstado(estado);
        return this;
    }

    public Asegurado build() {
        return this.asegurado;
    }

}
