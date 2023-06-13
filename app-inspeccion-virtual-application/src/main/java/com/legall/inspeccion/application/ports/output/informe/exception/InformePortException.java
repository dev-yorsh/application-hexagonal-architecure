package com.legall.inspeccion.application.ports.output.informe.exception;

public class InformePortException extends RuntimeException{

    public InformePortException(String message) {
        super(message);
    }

    public InformePortException(String message, Throwable cause) {
        super(message, cause);
    }
}
