package com.legall.inspeccion.application.ports.input.administracion.contratante.exception;

public class ContratanteExceptionUseCase extends RuntimeException {

    public ContratanteExceptionUseCase(String message) {
        super(message);
    }

    public ContratanteExceptionUseCase(String message, Throwable cause) {
        super(message, cause);
    }

    public ContratanteExceptionUseCase(Throwable cause) {
        super(cause);
    }
}
