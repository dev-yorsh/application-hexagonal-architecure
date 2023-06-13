package com.legall.inspeccion.adapter.input.rest.controller.inspeccion;

import com.legall.inspeccion.adapter.input.rest.annotations.RestControllerAdapter;
import com.legall.inspeccion.adapter.input.rest.constants.APIConstants;
import com.legall.inspeccion.application.ports.command.InspeccionSaveCommand;
import com.legall.inspeccion.application.service.inspeccion.inspeccion.InspeccionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestControllerAdapter
@RequestMapping(APIConstants.API_INSPECCION)
public class InspeccionController {

    private final InspeccionService inspeccionService;

    public InspeccionController(InspeccionService inspeccionService) {
        this.inspeccionService = inspeccionService;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody InspeccionSaveCommand request) {
        inspeccionService.save(request);
        return ResponseEntity.ok().build();
    }

}
