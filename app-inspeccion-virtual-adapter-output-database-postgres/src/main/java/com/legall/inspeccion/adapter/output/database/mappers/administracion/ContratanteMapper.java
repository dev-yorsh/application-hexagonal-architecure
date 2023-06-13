package com.legall.inspeccion.adapter.output.database.mappers.administracion;

import com.legall.inspeccion.adapter.output.database.entity.administracion.ContratanteEntityPostgres;
import com.legall.inspeccion.adapter.output.database.mappers.base.GenericMapper;
import com.legall.inspeccion.domain.administracion.Contratante;

import java.util.List;

public interface ContratanteMapper extends GenericMapper<ContratanteEntityPostgres, Contratante> {

    List<Contratante> toListDomain(List<ContratanteEntityPostgres> contratanteEntityPostgres);

}
