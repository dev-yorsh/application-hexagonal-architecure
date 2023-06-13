package com.legall.inspeccion.adapter.input.rest.controller.administracion;

import com.legall.inspeccion.adapter.input.rest.annotations.RestControllerAdapter;
import com.legall.inspeccion.adapter.input.rest.controller.base.GenericController;
import com.legall.inspeccion.adapter.input.rest.constants.APIConstants;
import com.legall.inspeccion.application.service.administracion.marca.MarcaService;
import com.legall.inspeccion.domain.administracion.Marca;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdapter
@RequestMapping(APIConstants.API_MARCA)
public class MarcaControllerImpl implements GenericController<Marca, Long> {

    private final MarcaService marcaService;

    public MarcaControllerImpl(final MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @GetMapping
    @Override
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(marcaService.findAll());
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return null;
    }

    @Override
    public ResponseEntity<?> save(Marca request) {

        return null;
    }

    @Override
    public ResponseEntity<?> update(Marca request) {
        return null;
    }

    @DeleteMapping
    @Override
    public ResponseEntity<?> delete(Long id) {
        return null;
    }

}
