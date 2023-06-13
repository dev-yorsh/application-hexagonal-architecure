package com.legall.inspeccion.application.ports.output.administracion.marca.exception;

public class MarcaExceptionPort extends RuntimeException {

    public MarcaExceptionPort(String message) {
        super(message);
    }

    public MarcaExceptionPort(Throwable cause) {
        super(cause);
    }

    public MarcaExceptionPort(String message, Throwable cause) {
        super(message, cause);
    }

}
