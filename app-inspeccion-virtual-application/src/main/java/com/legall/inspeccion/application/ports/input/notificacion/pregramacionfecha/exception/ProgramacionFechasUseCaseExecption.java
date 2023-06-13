package com.legall.inspeccion.application.ports.input.notificacion.pregramacionfecha.exception;

public class ProgramacionFechasUseCaseExecption extends RuntimeException{

    public ProgramacionFechasUseCaseExecption(String message) {
        super(message);
    }

    public ProgramacionFechasUseCaseExecption(String message, Throwable cause) {
        super(message, cause);
    }
}
