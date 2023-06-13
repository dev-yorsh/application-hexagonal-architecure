package com.legall.inspeccion.adapter.input.rest.dto.request.administracion.buider;

import com.legall.inspeccion.adapter.input.rest.dto.request.administracion.AseguradoRequest;

public class AseguradoRequestBuilder {

    private AseguradoRequest aseguradoRequest;

    public AseguradoRequestBuilder() {
        aseguradoRequest = new AseguradoRequest();
    }

    public AseguradoRequestBuilder tipoDocumentoId(Integer tipoDocumentoId) {
        aseguradoRequest.setTipoDocumentoId(tipoDocumentoId);
        return this;
    }

    public AseguradoRequestBuilder numeroDocumento(String numeroDocumento) {
        aseguradoRequest.setNumeroDocumento(numeroDocumento);
        return this;
    }

    public AseguradoRequestBuilder nombre(String nombre) {
        aseguradoRequest.setNombre(nombre);
        return this;
    }

    public AseguradoRequestBuilder apellidoPaterno(String apellidoPaterno) {
        aseguradoRequest.setApellidoPaterno(apellidoPaterno);
        return this;
    }

    public AseguradoRequestBuilder apellidoMaterno(String apellidoMaterno) {
        aseguradoRequest.setApellidoMaterno(apellidoMaterno);
        return this;
    }

    public AseguradoRequestBuilder distritoId(Integer distritoId) {
        aseguradoRequest.setDistritoId(distritoId);
        return this;
    }

    public AseguradoRequestBuilder domicilio(String domicilio) {
        aseguradoRequest.setDomicilio(domicilio);
        return this;
    }

    public AseguradoRequestBuilder referenciaDomicilio(String referenciaDomicilio) {
        aseguradoRequest.setReferenciaDomicilio(referenciaDomicilio);
        return this;
    }

    public AseguradoRequestBuilder telefonoMovil(String telefonoMovil) {
        aseguradoRequest.setTelefonoMovil(telefonoMovil);
        return this;
    }

    public AseguradoRequestBuilder telefonoFijo(String telefonoFijo) {
        aseguradoRequest.setTelefonoFijo(telefonoFijo);
        return this;
    }

    public AseguradoRequestBuilder correo(String correo) {
        aseguradoRequest.setCorreo(correo);
        return this;
    }

    public AseguradoRequest build() {
        return aseguradoRequest;
    }
}
