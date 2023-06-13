package com.legall.inspeccion.adapter.input.rest.controller.ping;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    @GetMapping
    public ResponseEntity<String> init() {
        return ResponseEntity.ok().body("Started UP");
    }
}
