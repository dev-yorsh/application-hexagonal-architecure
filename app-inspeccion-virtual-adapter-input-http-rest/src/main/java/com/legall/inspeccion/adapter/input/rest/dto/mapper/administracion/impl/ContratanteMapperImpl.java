package com.legall.inspeccion.adapter.input.rest.dto.mapper.administracion.impl;

import com.legall.inspeccion.adapter.input.rest.dto.mapper.administracion.ContratanteRequestMapper;
import com.legall.inspeccion.adapter.input.rest.dto.request.administracion.ContratanteRequest;
import com.legall.inspeccion.domain.administracion.Contratante;
import com.legall.inspeccion.domain.administracion.builder.ContratanteBuilder;
import org.springframework.stereotype.Component;

import static com.legall.inspeccion.domain.base.utilenum.EnumValue.documentoEnumValue;

@Component
public class ContratanteMapperImpl implements ContratanteRequestMapper {

    @Override
    public Contratante toModel(ContratanteRequest request) {
        return new ContratanteBuilder()
                .id(request.getContratanteId())
                .tipoDocumentoId(documentoEnumValue(request.getTipoDocumentoId()))
                .numeroDocumento(request.getNumeroDocumento())
                .razonSocial(request.getRazonSocial())
                .distritoId(request.getDistritoId())
                .domicilio(request.getDomicilio())
                .telefonoMovil(request.getTelefonoMovil())
                .telefonoFijo(request.getTelefonoFijo())
                .correo(request.getCorreo())
                .build();
    }
}
