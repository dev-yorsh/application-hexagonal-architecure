package com.legall.inspeccion.domain.administracion;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public enum TipoSucursalEnum {

    URBANO(1, "URBANO"),
    RURAL(2, "RURAL"),
    INDUSTRIAL(3, "INDUSTRIAL");

    private final Integer id;
    private final String nombreSucursal;

    TipoSucursalEnum(Integer id, String nombreSucursal) {
        this.id = id;
        this.nombreSucursal = nombreSucursal;
    }

    public Integer getId() {
        return id;
    }

    public String getnombreSucursal() {
        return nombreSucursal;
    }

    public static Optional<TipoSucursalEnum> getSucursalId(Integer id) {
        return Arrays.stream(TipoSucursalEnum.values())
                .filter(document -> Objects.equals(document.id, id))
                .findFirst();
    }

    public static Optional<TipoSucursalEnum> getSucursal(String nombreSucursal) {
        return Arrays.stream(TipoSucursalEnum.values())
                .filter(document -> Objects.equals(document.nombreSucursal, nombreSucursal))
                .findFirst();
    }
}
