package com.legall.inspeccion.adapter.input.rest.controller.base;

import org.springframework.http.ResponseEntity;

public interface GenericController<T, ID> {

    ResponseEntity<?> findAll();

    ResponseEntity<?> findById(ID id);

    ResponseEntity<?> save(T request);

    ResponseEntity<?> update(T request);

    ResponseEntity<?> delete(ID id);
}
