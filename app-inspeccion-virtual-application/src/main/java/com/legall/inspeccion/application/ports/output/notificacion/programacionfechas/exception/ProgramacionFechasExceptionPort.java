package com.legall.inspeccion.application.ports.output.notificacion.programacionfechas.exception;

public class ProgramacionFechasExceptionPort extends RuntimeException{

    public ProgramacionFechasExceptionPort(String message) {
        super(message);
    }

    public ProgramacionFechasExceptionPort(String message, Throwable cause) {
        super(message, cause);
    }
}
