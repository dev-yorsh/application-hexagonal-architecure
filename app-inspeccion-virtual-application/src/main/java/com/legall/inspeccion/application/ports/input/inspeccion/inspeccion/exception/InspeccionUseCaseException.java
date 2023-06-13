package com.legall.inspeccion.application.ports.input.inspeccion.inspeccion.exception;

public class InspeccionUseCaseException extends RuntimeException {

    public InspeccionUseCaseException(String message) {
        super(message);
    }

    public InspeccionUseCaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
