package com.legall.inspeccion.adapter.output.database.mappers.administracion;

import com.legall.inspeccion.adapter.output.database.entity.administracion.AseguradoEntityPostgres;
import com.legall.inspeccion.adapter.output.database.mappers.base.GenericMapper;
import com.legall.inspeccion.domain.administracion.Asegurado;

import java.util.List;

public interface AseguradoMapper extends GenericMapper<AseguradoEntityPostgres, Asegurado> {

    List<Asegurado> toListDomain(List<AseguradoEntityPostgres> aseguradoEntityPostgres);

}
