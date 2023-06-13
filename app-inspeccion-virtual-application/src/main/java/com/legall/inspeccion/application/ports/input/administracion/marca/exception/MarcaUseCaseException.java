package com.legall.inspeccion.application.ports.input.administracion.marca.exception;

public class MarcaUseCaseException extends RuntimeException {

    public MarcaUseCaseException(String message) {
        super(message);
    }

    public MarcaUseCaseException(Throwable cause) {
        super(cause);
    }

    public MarcaUseCaseException(String message, Throwable cause) {
        super(message, cause);
    }

}
