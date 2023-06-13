package com.legall.inspeccion.adapter.output.database.mappers.administracion.impl;

import com.legall.inspeccion.adapter.output.database.entity.administracion.MarcaEntityPostgres;
import com.legall.inspeccion.adapter.output.database.mappers.administracion.MarcaMapper;
import com.legall.inspeccion.domain.administracion.Marca;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Objects.isNull;

@Component
public class MarcaPostgresMapperImpl implements MarcaMapper {

    @Override
    public MarcaEntityPostgres toEntity(Marca dto) {
        this.validarObjeto(dto);
        return  new MarcaEntityPostgres(dto.getId(), dto.getNombre(), dto.getPrefijo());
    }

    @Override
    public Marca toDomain(MarcaEntityPostgres entity) {
        this.validarObjeto(entity);
        return new Marca(entity.getMarcaId(), entity.getNombre(), entity.getPrefijo());
    }

    @Override
    public List<Marca> toListDomain(List<MarcaEntityPostgres> entities) {
        return entities.stream().map(this::toDomain).toList();
    }

    private void validarObjeto(Object marca) {
        if (isNull(marca))
            throw new NullPointerException("Error al realizar el mapeo de la Marca (no puede ser nulo)");
    }
}
