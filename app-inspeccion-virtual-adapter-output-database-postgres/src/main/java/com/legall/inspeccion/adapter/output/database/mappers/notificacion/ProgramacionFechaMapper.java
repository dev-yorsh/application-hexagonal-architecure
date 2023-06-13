package com.legall.inspeccion.adapter.output.database.mappers.notificacion;

import com.legall.inspeccion.adapter.output.database.entity.notificacion.ProgramacionFechasEntityPostgres;
import com.legall.inspeccion.adapter.output.database.mappers.base.GenericMapper;
import com.legall.inspeccion.domain.notificacion.ProgramacionFechas;

import java.util.List;

public interface ProgramacionFechaMapper extends GenericMapper<ProgramacionFechasEntityPostgres, ProgramacionFechas> {

    List<ProgramacionFechas> toListDomain(List<ProgramacionFechasEntityPostgres> entities);
}
