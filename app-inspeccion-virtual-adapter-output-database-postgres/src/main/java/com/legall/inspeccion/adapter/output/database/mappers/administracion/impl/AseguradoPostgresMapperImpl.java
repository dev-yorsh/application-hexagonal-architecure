package com.legall.inspeccion.adapter.output.database.mappers.administracion.impl;

import com.legall.inspeccion.adapter.output.database.entity.administracion.AseguradoEntityPostgres;
import com.legall.inspeccion.adapter.output.database.entity.administracion.builder.AseguradoEntityBuilder;
import com.legall.inspeccion.adapter.output.database.mappers.administracion.AseguradoMapper;
import com.legall.inspeccion.domain.administracion.Asegurado;
import com.legall.inspeccion.domain.administracion.builder.AseguradoBuilder;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.legall.inspeccion.domain.base.utilenum.EnumValue.documentoEnumValue;
import static com.legall.inspeccion.domain.base.utilenum.EnumValue.estadoEnumValue;

@Component
public class AseguradoPostgresMapperImpl implements AseguradoMapper {

    @Override
    public AseguradoEntityPostgres toEntity(Asegurado dto) {
        return new AseguradoEntityBuilder()
                .aseguradoId(dto.getId())
                .tipoDocumentoId(dto.getTipoDocumentoId().getId())
                .numeroDocumento(dto.getNumeroDocumento())
                .nombre(dto.getNombre())
                .apellidoPaterno(dto.getApellidoPaterno())
                .apellidoMaterno(dto.getApellidoMaterno())
                .domicilio(dto.getDomicilio())
                .referenciaDomicilio(dto.getReferenciaDomicilio())
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
    public Asegurado toDomain(AseguradoEntityPostgres entity) {
        return new AseguradoBuilder()
                .id(entity.getAseguradoId())
                .nombre(entity.getNombre())
                .apellidoPaterno(entity.getApellidoPaterno())
                .apellidoMaterno(entity.getApellidoMaterno())
                .referenciaDomicilio(entity.getReferenciaDomicilio())
                .tipoDocumentoId(documentoEnumValue(entity.getTipoDocumentoId()))
                .numeroDocumento(entity.getNumeroDocumento())
                .distritoId(entity.getDistritoId())
                .domicilio(entity.getDomicilio())
                .telefonoMovil(entity.getTelefonoMovil())
                .telefonoFijo(entity.getTelefonoFijo())
                .correo(entity.getCorreo())
                .creadoPor(entity.getCreadoPor())
                .fechaCreacion(entity.getFechaCreacion())
                .modificadoPor(entity.getModificadoPor())
                .fechaModificacion(entity.getFechaModificacion())
                .estado(estadoEnumValue(entity.getEstado()))
                .build();
    }

    @Override
    public List<Asegurado> toListDomain(List<AseguradoEntityPostgres> entities) {
        return entities.stream().map(this::toDomain).toList();
    }

}
