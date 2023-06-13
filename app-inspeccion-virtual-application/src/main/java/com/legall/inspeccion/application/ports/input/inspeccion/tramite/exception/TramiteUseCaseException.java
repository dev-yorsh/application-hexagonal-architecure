package com.legall.inspeccion.application.ports.input.inspeccion.tramite.exception;

public class TramiteUseCaseException extends RuntimeException {

    public TramiteUseCaseException(String message) {
        super(message);
    }

    public TramiteUseCaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public TramiteUseCaseException(Throwable cause) {
        super(cause);
    }
}
