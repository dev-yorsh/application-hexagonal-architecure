package com.legall.inspeccion.application.ports.input.base;

public class GlobalUseCaseException extends RuntimeException{

    public GlobalUseCaseException(String message) {
        super(message);
    }

    public GlobalUseCaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public GlobalUseCaseException(Throwable cause) {
        super(cause);
    }
}
