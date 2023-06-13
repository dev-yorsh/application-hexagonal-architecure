package com.legall.inspeccion.adapter.output.database.mappers.administracion.impl;

import com.legall.inspeccion.adapter.output.database.constants.MessageConstants;
import com.legall.inspeccion.adapter.output.database.entity.administracion.ContratanteEntityPostgres;
import com.legall.inspeccion.adapter.output.database.entity.administracion.builder.ContratanteEntityBuilder;
import com.legall.inspeccion.adapter.output.database.mappers.administracion.ContratanteMapper;
import com.legall.inspeccion.domain.administracion.Contratante;
import com.legall.inspeccion.domain.administracion.builder.ContratanteBuilder;
import static com.legall.inspeccion.domain.base.utilenum.EnumValue.documentoEnumValue;
import static com.legall.inspeccion.domain.base.utilenum.EnumValue.estadoEnumValue;
import static java.util.Objects.isNull;

import org.springframework.stereotype.Component;

import java.util.List;

import static com.legall.inspeccion.adapter.output.database.constants.MessageConstants.ErrorConstants.MAPPER_ERROR;

@Component
public class ContratantePostgresMapperImpl implements ContratanteMapper {

    @Override
    public ContratanteEntityPostgres toEntity(Contratante dto) {
        this.validarObjeto(dto);
        return new ContratanteEntityBuilder()
                .contratanteId(dto.getId())
                .tipoDocumentoId(dto.getTipoDocumentoId().getId())
                .numeroDocumento(dto.getNumeroDocumento())
                .razonSocial(dto.getRazonSocial())
                .domicilio(dto.getDomicilio())
                .distritoId(dto.getDistritoId())
                .telefonoMovil(dto.getTelefonoMovil())
                .telefonoFijo(dto.getTelefonoFijo())
                .correo(dto.getCorreo())
                .fechaCreacion(dto.getFechaCreacion())
                .creadoPor(dto.getCreadoPor())
                .fechaModificacion(dto.getFechaModificacion())
                .modificadoPor(dto.getModificadoPor())
                .estado(dto.getEstado().getId())
                .build();
    }

    @Override
    public Contratante toDomain(ContratanteEntityPostgres entity) {
        this.validarObjeto(entity);
        return new ContratanteBuilder()
                .id(entity.getContratanteId())
                .tipoDocumentoId(documentoEnumValue(entity.getTipoDocumentoId()))
                .numeroDocumento(entity.getNumeroDocumento())
                .razonSocial(entity.getRazonSocial())
                .distritoId(entity.getDistritoId())
                .domicilio(entity.getDomicilio())
                .telefonoMovil(entity.getTelefonoMovil())
                .telefonoFijo(entity.getTelefonoFijo())
                .correo(entity.getCorreo())
                .fechaCreacion(entity.getFechaCreacion())
                .creadoPor(entity.getCreadoPor())
                .fechaModificacion(entity.getFechaModificacion())
                .modificadoPor(entity.getModificadoPor())
                .estado(estadoEnumValue(entity.getEstado()))
                .build();
    }

    @Override
    public List<Contratante> toListDomain(List<ContratanteEntityPostgres> entities) {
        return entities.stream().map(this::toDomain).toList();
    }

    private void validarObjeto(Object marca) {
        if (isNull(marca))
            throw new NullPointerException(MAPPER_ERROR);
    }

}
