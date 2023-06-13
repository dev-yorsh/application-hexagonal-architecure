package com.legall.inspeccion.application.ports.output.administracion.asegurado.exception;

public class AseguradoExceptionPort extends RuntimeException{

    public AseguradoExceptionPort(String message) {
        super(message);
    }

    public AseguradoExceptionPort(String message, Throwable cause) {
        super(message, cause);
    }
    public AseguradoExceptionPort(Throwable cause) {
        super(cause);
    }
}
