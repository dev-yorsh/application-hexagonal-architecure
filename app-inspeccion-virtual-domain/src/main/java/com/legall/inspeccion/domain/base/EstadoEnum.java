package com.legall.inspeccion.domain.base;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public enum EstadoEnum {

    ACTIVO("1", "ACTIVO"),
    INACTIVO("0", "INACTIVO");

    private final String id;
    private final String estado;

    EstadoEnum(String id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getId() {
        return (id != null) ? id: " " ;
    }

    public static Optional<EstadoEnum> getEstadoId(String id) {
        return Arrays.stream(EstadoEnum.values())
                .filter(estado -> Objects.equals(estado.id, id))
                .findFirst();
    }

}
