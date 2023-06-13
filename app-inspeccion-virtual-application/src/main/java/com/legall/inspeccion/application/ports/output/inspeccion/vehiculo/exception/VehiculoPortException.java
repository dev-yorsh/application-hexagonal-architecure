package com.legall.inspeccion.application.ports.output.inspeccion.vehiculo.exception;

public class VehiculoPortException extends RuntimeException{

    public VehiculoPortException(String message) {
        super(message);
    }

    public VehiculoPortException(String message, Throwable cause) {
        super(message, cause);
    }

}
