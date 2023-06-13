package com.legall.inspeccion.domain.inspeccion.exception;

public class InspeccionException extends RuntimeException {

    public InspeccionException(String message) {
        super(message);
    }

    public InspeccionException(Throwable cause) {
        super(cause);
    }

    public InspeccionException(String message, Throwable cause) {
        super(message, cause);
    }

}
