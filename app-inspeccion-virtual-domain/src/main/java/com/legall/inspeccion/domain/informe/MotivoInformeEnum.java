package com.legall.inspeccion.domain.informe;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public enum MotivoInformeEnum {

    PROGRAMADO(1, "PROGRAMADO"),
    REPROGRAMADO(2, "REPROGRAMADO"),
    COMPLETADO(3, "COMPLETADO");

    private final Integer id;
    private final String motivoInforme;

    MotivoInformeEnum(Integer id, String motivoInforme) {
        this.id = id;
        this.motivoInforme = motivoInforme;
    }

    public Integer getId() {
        return id;
    }

    public String getMotivoInforme() {
        return motivoInforme;
    }

    public static Optional<MotivoInformeEnum> getMotivoId(Integer id) {
        return Arrays.stream(MotivoInformeEnum.values())
                .filter(document -> Objects.equals(document.id, id))
                .findFirst();
    }

    public static Optional<MotivoInformeEnum> getMotivo(String motivoInforme) {
        return Arrays.stream(MotivoInformeEnum.values())
                .filter(document -> Objects.equals(document.motivoInforme, motivoInforme))
                .findFirst();
    }
}