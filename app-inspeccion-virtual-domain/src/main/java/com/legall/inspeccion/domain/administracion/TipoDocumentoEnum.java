package com.legall.inspeccion.domain.administracion;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public enum TipoDocumentoEnum {

    DNI(2, "DNI"),
    RUC(3, "RUC"),
    CARNET_EXTRANJERIA(4, "CARNET DE EXTRANJERIA");

    private final Integer id;
    private final String documento;

    TipoDocumentoEnum(Integer id, String documento) {
        this.id = id;
        this.documento = documento;
    }

    public String getDocumento() {
        return this.documento;
    }

    public Integer getId() {
        return this.id;
    }

    public static Optional<TipoDocumentoEnum> getDocumentId(Integer id) {
        return Arrays.stream(TipoDocumentoEnum.values())
                .filter(document -> Objects.equals(document.id, id))
                .findFirst();
    }

    public static Optional<TipoDocumentoEnum> getDocumento(String documento) {
        return Arrays.stream(TipoDocumentoEnum.values())
                .filter(document -> Objects.equals(document.documento, documento))
                .findFirst();
    }


}