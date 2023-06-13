package com.legall.inspeccion.adapter.output.database.mappers.inspeccion;

import com.legall.inspeccion.adapter.output.database.entity.inspeccion.TramiteEntityPostgres;
import com.legall.inspeccion.adapter.output.database.mappers.base.GenericMapper;
import com.legall.inspeccion.domain.inspeccion.Tramite;

import java.util.List;

public interface TramiteMapper extends GenericMapper<TramiteEntityPostgres, Tramite> {

    List<Tramite> toListDomain(List<TramiteEntityPostgres> tramiteEntityPostgres);
}
