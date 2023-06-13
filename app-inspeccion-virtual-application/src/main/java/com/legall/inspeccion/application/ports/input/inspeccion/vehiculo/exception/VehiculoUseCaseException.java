package com.legall.inspeccion.application.ports.input.inspeccion.vehiculo.exception;

public class VehiculoUseCaseException extends RuntimeException{

    public VehiculoUseCaseException(String message) {
        super(message);
    }

    public VehiculoUseCaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
