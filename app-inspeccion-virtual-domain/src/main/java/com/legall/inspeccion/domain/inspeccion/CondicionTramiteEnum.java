package com.legall.inspeccion.domain.inspeccion;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public enum CondicionTramiteEnum {

    PENDIENTE(6, "PENDIENTE"),
    ATENDIDO(7, "ATENDIDO");

    private final Integer id;
    private final String estadoTramite;

    CondicionTramiteEnum(Integer id, String estadoTramite) {
        this.id = id;
        this.estadoTramite = estadoTramite;
    }

    public Integer getId() {
        return id;
    }

    public String getestadoTramite() {
        return estadoTramite;
    }

    public static Optional<CondicionTramiteEnum> getCondicionId(Integer id) {
        return Arrays.stream(CondicionTramiteEnum.values())
                .filter(document -> Objects.equals(document.id, id))
                .findFirst();
    }

    public static Optional<CondicionTramiteEnum> getCondicion(String estadoTramite) {
        return Arrays.stream(CondicionTramiteEnum.values())
                .filter(document -> Objects.equals(document.estadoTramite, estadoTramite))
                .findFirst();
    }
}
