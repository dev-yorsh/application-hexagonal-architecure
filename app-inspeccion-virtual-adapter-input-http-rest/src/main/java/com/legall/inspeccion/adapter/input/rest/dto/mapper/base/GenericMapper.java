package com.legall.inspeccion.adapter.input.rest.dto.mapper.base;

import java.util.List;

public interface GenericMapper<M, R> {

    M toModel(R request);
}
