package com.legall.inspeccion.application.ports.output.administracion.contratante.exception;

public class ContratanteExceptionPort extends RuntimeException {

    public ContratanteExceptionPort(String message) {
        super(message);
    }

    public ContratanteExceptionPort(String message, Throwable cause) {
        super(message, cause);
    }

    public ContratanteExceptionPort(Throwable cause) {
        super(cause);
    }
}
