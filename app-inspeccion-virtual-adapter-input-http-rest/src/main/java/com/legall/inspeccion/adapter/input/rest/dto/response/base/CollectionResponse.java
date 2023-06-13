package com.legall.inspeccion.adapter.input.rest.dto.response.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CollectionResponse<T> extends BaseResponse<List<T>> {

    @JsonProperty("pagina_actual")
    private Integer paginaActual;

    @JsonProperty("numero_elementos")
    private Integer numeroElementos;

    @JsonProperty("total_paginas")
    private Integer totalPaginas;

    @JsonProperty("total_elementos")
    private Long totalElementos;

    public CollectionResponse(Integer statusCode, String message, List<T> response) {
        super(statusCode, message, response);
    }
}
