package com.legall.inspeccion.application.ports.input.informe.exception;

public class InformeUseCaseException extends RuntimeException {

    public InformeUseCaseException(String message) {
        super(message);
    }

    public InformeUseCaseException(Throwable cause) {
        super(cause);
    }

    public InformeUseCaseException(String message, Throwable cause) {
        super(message, cause);
    }

}
