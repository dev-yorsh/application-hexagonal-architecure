package com.legall.inspeccion.application.ports.output.inspeccion.inspeccion.exception;

public class InspeccionPortException extends RuntimeException{

    public InspeccionPortException(String message) {
        super(message);
    }

    public InspeccionPortException(String message, Throwable cause) {
        super(message, cause);
    }

}
