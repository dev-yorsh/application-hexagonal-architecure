package com.legall.inspeccion.application.ports.input.administracion.asegurado.exception;

public class AseguradoExceptionUseCase extends RuntimeException{

        public AseguradoExceptionUseCase(String message) {
            super(message);
        }

        public AseguradoExceptionUseCase(String message, Throwable cause) {
            super(message, cause);
        }

        public AseguradoExceptionUseCase(Throwable cause) {
            super(cause);
        }
}
