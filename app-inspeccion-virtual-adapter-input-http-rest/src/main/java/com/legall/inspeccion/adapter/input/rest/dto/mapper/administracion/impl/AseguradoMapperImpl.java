package com.legall.inspeccion.adapter.input.rest.dto.mapper.administracion.impl;

import com.legall.inspeccion.adapter.input.rest.dto.mapper.administracion.AseguradoRequestMapper;
import com.legall.inspeccion.adapter.input.rest.dto.request.administracion.AseguradoRequest;
import com.legall.inspeccion.domain.administracion.Asegurado;
import com.legall.inspeccion.domain.administracion.builder.AseguradoBuilder;
import org.springframework.stereotype.Component;

import static com.legall.inspeccion.domain.base.utilenum.EnumValue.documentoEnumValue;

@Component
public class AseguradoMapperImpl implements AseguradoRequestMapper {

    @Override
    public Asegurado toModel(AseguradoRequest request) {
        return new AseguradoBuilder()
                .id(request.getAseguradoId())
                .tipoDocumentoId(documentoEnumValue(request.getTipoDocumentoId()))
                .numeroDocumento(request.getNumeroDocumento())
                .nombre(request.getNombre())
                .apellidoPaterno(request.getApellidoPaterno())
                .apellidoMaterno(request.getApellidoMaterno())
                .distritoId(request.getDistritoId())
                .domicilio(request.getDomicilio())
                .referenciaDomicilio(request.getReferenciaDomicilio())
                .telefonoMovil(request.getTelefonoMovil())
                .telefonoFijo(request.getTelefonoFijo())
                .correo(request.getCorreo())
                .build();

    }
}
