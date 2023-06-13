package com.legall.inspeccion.adapter.output.database.mappers.notificacion.impl;

import com.legall.inspeccion.adapter.output.database.entity.notificacion.ProgramacionFechasEntityPostgres;
import com.legall.inspeccion.adapter.output.database.entity.notificacion.builder.ProgramacionFechasEntityBuilder;
import com.legall.inspeccion.adapter.output.database.mappers.notificacion.ProgramacionFechaMapper;
import com.legall.inspeccion.domain.notificacion.ProgramacionFechas;
import com.legall.inspeccion.domain.notificacion.builder.ProgramacionFechasBuilder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProgramacionFechaMapperImpl implements ProgramacionFechaMapper {

    @Override
    public ProgramacionFechasEntityPostgres toEntity(ProgramacionFechas dto) {
        return new ProgramacionFechasEntityBuilder()
                .id(dto.getId())
                .empleadoId(dto.getEmpleadoId())
                .aseguradoId(dto.getAseguradoId())
                .fechaProgramada(dto.getFechaProgramada())
                .tiempoInspeccion(dto.getTiempoInspeccion())
                .fechaFinalizacion(dto.getFechaFinalizacion())
                .estaReservado(dto.getEstaReservado())
                .build();
    }

    @Override
    public ProgramacionFechas toDomain(ProgramacionFechasEntityPostgres entity) {
        return new ProgramacionFechasBuilder()
                .id(entity.getProgramacionFechasId())
                .empleadoId(entity.getEmpleadoId())
                .aseguradoId(entity.getAseguradoId())
                .fechaProgramada(entity.getFechaProgramada())
                .fechaFinalizacion(entity.getFechaFinalizacion())
                .tiempoInspeccion(entity.getTiempoInspeccion())
                .estaReservado(entity.getEstaReservado())
                .build();
    }

    @Override
    public List<ProgramacionFechas> toListDomain(List<ProgramacionFechasEntityPostgres> entities) {
        return entities.stream().map(this::toDomain).toList();

    }
}
