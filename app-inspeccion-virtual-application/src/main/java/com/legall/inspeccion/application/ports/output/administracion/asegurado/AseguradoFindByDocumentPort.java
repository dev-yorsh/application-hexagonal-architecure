package com.legall.inspeccion.application.ports.output.administracion.asegurado;

import com.legall.inspeccion.application.ports.output.administracion.asegurado.exception.AseguradoExceptionPort;
import com.legall.inspeccion.domain.administracion.Asegurado;

import java.util.Optional;

@FunctionalInterface
public interface AseguradoFindByDocumentPort {

    Optional<Asegurado> findByDocument(String document) throws AseguradoExceptionPort;
}
