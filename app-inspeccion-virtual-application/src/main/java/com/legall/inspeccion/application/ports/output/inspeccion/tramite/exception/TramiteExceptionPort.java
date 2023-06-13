package com.legall.inspeccion.application.ports.output.inspeccion.tramite.exception;

public class TramiteExceptionPort extends RuntimeException{

    public TramiteExceptionPort(String message) {
        super(message);
    }

    public TramiteExceptionPort(Throwable cause) {
        super(cause);
    }

    public TramiteExceptionPort(String message, Throwable cause) {
        super(message, cause);
    }
}
