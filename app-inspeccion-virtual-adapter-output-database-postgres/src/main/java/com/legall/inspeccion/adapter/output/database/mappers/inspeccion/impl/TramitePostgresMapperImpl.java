package com.legall.inspeccion.adapter.output.database.mappers.inspeccion.impl;

import com.legall.inspeccion.adapter.output.database.entity.inspeccion.TramiteEntityPostgres;
import com.legall.inspeccion.adapter.output.database.entity.inspeccion.builder.TramiteEntityBuilder;
import com.legall.inspeccion.adapter.output.database.mappers.administracion.impl.AseguradoPostgresMapperImpl;
import com.legall.inspeccion.adapter.output.database.mappers.administracion.impl.ContratantePostgresMapperImpl;
import com.legall.inspeccion.adapter.output.database.mappers.inspeccion.TramiteMapper;
import com.legall.inspeccion.domain.inspeccion.Tramite;
import com.legall.inspeccion.domain.inspeccion.builder.TramiteBuilder;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.legall.inspeccion.domain.base.utilenum.EnumValue.condicionEnumValue;
import static com.legall.inspeccion.domain.base.utilenum.EnumValue.estadoEnumValue;

@Component
public class TramitePostgresMapperImpl implements TramiteMapper {

    private final ContratantePostgresMapperImpl contratantePostgresMapper;
    private final AseguradoPostgresMapperImpl aseguradoPostgresMapper;

    public TramitePostgresMapperImpl(ContratantePostgresMapperImpl contratantePostgresMapper,
                                     AseguradoPostgresMapperImpl aseguradoPostgresMapper) {
        this.contratantePostgresMapper = contratantePostgresMapper;
        this.aseguradoPostgresMapper = aseguradoPostgresMapper;
    }

    @Override
    public TramiteEntityPostgres toEntity(Tramite dto) {
        return new TramiteEntityBuilder()
                .tramiteId(dto.getId())
                .codigoTramite(dto.getCodigoTramite())
                .condicionTramiteId(dto.getCondicionTramite().getId())
                .observacion(dto.getObservacion())
                .contratante(contratantePostgresMapper.toEntity(dto.getContratante()))
                .asegurado(aseguradoPostgresMapper.toEntity(dto.getAsegurado()))
                .fechaCreacion(dto.getFechaCreacion())
                .creadoPor(dto.getCreadoPor())
                .fechaModificacion(dto.getFechaModificacion())
                .modificadoPor(dto.getModificadoPor())
                .estado(dto.getEstado().getId())
                .build();
    }

    @Override
    public Tramite toDomain(TramiteEntityPostgres entity) {
        return new TramiteBuilder()
                .id(entity.getTramiteId())
                .codigoTramite(entity.getCodigoTramite())
                .condicionTramite(condicionEnumValue(entity.getCondicionTramiteId()))
                .contratante(contratantePostgresMapper.toDomain(entity.getContratante()))
                .asegurado(aseguradoPostgresMapper.toDomain(entity.getAsegurado()))
                .observacion(entity.getObservacion())
                .fechaCreacion(entity.getFechaCreacion())
                .creadoPor(entity.getCreadoPor())
                .fechaModificacion(entity.getFechaModificacion())
                .modificadoPor(entity.getModificadoPor())
                .estado(estadoEnumValue(entity.getEstado()))
                .build();
    }

    @Override
    public List<Tramite> toListDomain(List<TramiteEntityPostgres> entities) {
        return entities.stream().map(this::toDomain).toList();
    }

}
