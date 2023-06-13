package com.legall.inspeccion.adapter.input.rest.controller.inspeccion;

import com.legall.inspeccion.adapter.input.rest.annotations.RestControllerAdapter;
import com.legall.inspeccion.adapter.input.rest.constants.APIConstants;
import com.legall.inspeccion.adapter.input.rest.controller.base.GenericController;
import com.legall.inspeccion.adapter.input.rest.dto.mapper.inspeccion.TramiteRequestMapper;
import com.legall.inspeccion.adapter.input.rest.dto.request.inspeccion.TramiteRequest;
import com.legall.inspeccion.application.service.inspeccion.tramite.TramiteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestControllerAdapter
@RequestMapping(APIConstants.API_TRAMITE)
public class TramiteControllerImpl implements GenericController<TramiteRequest, Long> {

    private final TramiteService tramiteService;
    private final TramiteRequestMapper tramiteRequestMapper;

    public TramiteControllerImpl(final TramiteService tramiteService,
                                 final TramiteRequestMapper tramiteRequestMapper) {
        this.tramiteService = tramiteService;
        this.tramiteRequestMapper = tramiteRequestMapper;
    }

    @GetMapping
    @Override
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(tramiteService.findAll());
    }

    @Override
    public ResponseEntity<?> findById(Long aLong) {
        return null;
    }

    @PostMapping
    @Override
    public ResponseEntity<?> save(@RequestBody TramiteRequest request) {
        tramiteService.save(tramiteRequestMapper.toModel(request));
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<?> update(@RequestBody TramiteRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(Long aLong) {
        return null;
    }

}
