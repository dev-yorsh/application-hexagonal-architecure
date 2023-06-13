package com.legall.inspeccion.adapter.output.database.mappers.base;

import java.util.List;

public interface GenericMapper<E, D> {

    E toEntity(D dto);

    D toDomain(E entity);

}
