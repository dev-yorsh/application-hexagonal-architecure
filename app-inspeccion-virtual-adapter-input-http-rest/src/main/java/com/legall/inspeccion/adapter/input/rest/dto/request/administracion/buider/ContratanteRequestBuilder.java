package com.legall.inspeccion.adapter.input.rest.dto.request.administracion.buider;

import com.legall.inspeccion.adapter.input.rest.dto.request.administracion.ContratanteRequest;

public class ContratanteRequestBuilder {

    private ContratanteRequest contratanteRequest;

    public ContratanteRequestBuilder() {
        contratanteRequest = new ContratanteRequest();
    }

    public ContratanteRequestBuilder tipoDocumentoId(Integer tipoDocumentoId) {
        contratanteRequest.setTipoDocumentoId(tipoDocumentoId);
        return this;
    }

    public ContratanteRequestBuilder numeroDocumento(String numeroDocumento) {
        contratanteRequest.setNumeroDocumento(numeroDocumento);
        return this;
    }

    public ContratanteRequestBuilder razonsocial(String razonsocial) {
        contratanteRequest.setRazonSocial(razonsocial);
        return this;
    }

    public ContratanteRequestBuilder distritoId(Integer distritoId) {
        contratanteRequest.setDistritoId(distritoId);
        return this;
    }

    public ContratanteRequestBuilder domicilio(String domicilio) {
        contratanteRequest.setDomicilio(domicilio);
        return this;
    }

    public ContratanteRequestBuilder telefonoMovil(String telefonoMovil) {
        contratanteRequest.setTelefonoMovil(telefonoMovil);
        return this;
    }

    public ContratanteRequestBuilder telefonoFijo(String telefonoFijo) {
        contratanteRequest.setTelefonoFijo(telefonoFijo);
        return this;
    }

    public ContratanteRequestBuilder correo(String correo) {
        contratanteRequest.setCorreo(correo);
        return this;
    }

    public ContratanteRequest build() {
        return contratanteRequest;
    }

}
