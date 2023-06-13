package com.legall.inspeccion.adapter.output.database.mappers.administracion;

import com.legall.inspeccion.adapter.output.database.entity.administracion.MarcaEntityPostgres;
import com.legall.inspeccion.adapter.output.database.mappers.base.GenericMapper;
import com.legall.inspeccion.domain.administracion.Marca;

import java.util.List;

public interface MarcaMapper extends GenericMapper<MarcaEntityPostgres, Marca> {

    List<Marca> toListDomain(List<MarcaEntityPostgres> marcaEntityPostgres);

}
