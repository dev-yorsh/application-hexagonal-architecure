package com.legall.inspeccion.domain.base.utilenum.exception;

public class EnumIlegalValueException extends RuntimeException{

    public EnumIlegalValueException(String message) {
        super(message);
    }

    public EnumIlegalValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public EnumIlegalValueException(Throwable cause) {
        super(cause);
    }
}
