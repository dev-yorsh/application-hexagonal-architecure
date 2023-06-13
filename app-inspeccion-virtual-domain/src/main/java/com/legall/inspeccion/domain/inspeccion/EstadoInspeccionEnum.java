package com.legall.inspeccion.domain.inspeccion;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public enum EstadoInspeccionEnum {

    EN_ESPERA(1, "EN ESPERA"),
    DISPONIBLE(2, "DISPONIBLE"),
    COMPLETADO(3, "COMPLETADO"),
    ANULADO(4, "ANULADO");

    private final Integer id;
    private final String estadoInspeccion;

    EstadoInspeccionEnum(Integer id, String estadoInspeccion) {
        this.id = id;
        this.estadoInspeccion = estadoInspeccion;
    }

    public Integer getId() {
        return id;
    }

    public String getEstadoInspeccion() {
        return estadoInspeccion;
    }

    public static Optional<EstadoInspeccionEnum> getEstadoInspeccionId(Integer id) {
        return Arrays.stream(EstadoInspeccionEnum.values())
                .filter(document -> Objects.equals(document.id, id))
                .findFirst();
    }

    public static Optional<EstadoInspeccionEnum> getEstadoInspeccion(String estadoInspeccion) {
        return Arrays.stream(EstadoInspeccionEnum.values())
                .filter(document -> Objects.equals(document.estadoInspeccion, estadoInspeccion))
                .findFirst();
    }
}
