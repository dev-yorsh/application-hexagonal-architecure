package com.legall.inspeccion.adapter.output.database.mappers.inspeccion.impl;

import com.legall.inspeccion.adapter.output.database.entity.inspeccion.InspeccionEntityPostgres;
import com.legall.inspeccion.adapter.output.database.entity.inspeccion.builder.InspeccionEntityBuilder;
import com.legall.inspeccion.adapter.output.database.mappers.inspeccion.InspeccionMapper;
import com.legall.inspeccion.domain.base.utilenum.EnumValue;
import com.legall.inspeccion.domain.inspeccion.Inspeccion;
import com.legall.inspeccion.domain.inspeccion.builder.InspeccionBuilder;
import org.springframework.stereotype.Component;

@Component
public class InspeccionMapperImpl implements InspeccionMapper {

    private final VehiculoPostgresMapperImpl vehiculoMapper;

    public InspeccionMapperImpl(VehiculoPostgresMapperImpl vehiculoMapper) {
        this.vehiculoMapper = vehiculoMapper;
    }


    @Override
    public InspeccionEntityPostgres toEntity(Inspeccion dto) {
        return new InspeccionEntityBuilder()
                .id(dto.getId())
                .tramiteId(dto.getTramiteId())
                .vehiculo(vehiculoMapper.toEntity(dto.getVehiculo()))
                .codigoInspeccion(dto.getCodigoInspeccion())
                .estadoInspeccionId(dto.getEstadoInspeccion().getId())
                .observacion(dto.getObservacion())
                .estado(dto.getEstado().getId())
                .build();

    }

    @Override
    public Inspeccion toDomain(InspeccionEntityPostgres entity) {
        return new InspeccionBuilder()
                .id(entity.getInspeccionId())
                .tramiteId(entity.getTramiteId())
                .vehiculo(vehiculoMapper.toDomain(entity.getVehiculo()))
                .codigoInspeccion(entity.getCodigoInspeccion())
                .estadoInspeccion(EnumValue.estadoInspeccionEnum(entity.getEstadoInspeccionId()))
                .observacion(entity.getObservacion())
                .estado(EnumValue.estadoEnumValue(entity.getEstado()))
                .build();
    }

}
