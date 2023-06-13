package com.legall.inspeccion.adapter.output.database.mappers.informe.impl;

import com.legall.inspeccion.adapter.output.database.entity.informe.InformeEntityPostgres;
import com.legall.inspeccion.adapter.output.database.entity.informe.builder.InformeEntityBuilder;
import com.legall.inspeccion.adapter.output.database.mappers.informe.InformeMapper;
import com.legall.inspeccion.adapter.output.database.mappers.notificacion.impl.ProgramacionFechaMapperImpl;
import com.legall.inspeccion.domain.informe.Informe;
import com.legall.inspeccion.domain.informe.builder.InformeBuilder;
import org.springframework.stereotype.Component;

import static com.legall.inspeccion.domain.base.utilenum.EnumValue.estadoEnumValue;
import static com.legall.inspeccion.domain.base.utilenum.EnumValue.motivoInformeEnum;

@Component
public class InformeMapperImpl implements InformeMapper {

    private final ProgramacionFechaMapperImpl programacionFechaMapper;

    public InformeMapperImpl(ProgramacionFechaMapperImpl programacionFechaMapper) {
        this.programacionFechaMapper = programacionFechaMapper;
    }

    @Override
    public InformeEntityPostgres toEntity(Informe dto) {
        return new InformeEntityBuilder()
                .informeId(dto.getId())
                .inspeccionId(dto.getInspeccionId())
                .programacionFechas(programacionFechaMapper.toEntity(dto.getProgramacionFechas()))
                .motivoInformeId(dto.getMotivoInforme().getId())
                .detalleInforme(dto.getDetalleInforme())
                .estaAnulado(dto.getEstaAnulado())
                .estado(dto.getEstado().getId())
                .build();

    }

    @Override
    public Informe toDomain(InformeEntityPostgres entity) {
        return new InformeBuilder()
                .id(entity.getInformeId())
                .inspeccionId(entity.getInspeccionId())
                .motivoInforme(motivoInformeEnum(entity.getMotivoInformeId()))
                .detalleInforme(entity.getDetalleInforme())
                .estaAnulado(entity.getEstaAnulado())
                .programacionFechas(programacionFechaMapper.toDomain(entity.getProgramacionFechas()))
                .estado(estadoEnumValue(entity.getEstado()))
                .build();
    }
}
