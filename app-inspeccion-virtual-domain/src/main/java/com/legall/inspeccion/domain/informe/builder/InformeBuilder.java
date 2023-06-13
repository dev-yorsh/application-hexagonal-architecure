package com.legall.inspeccion.domain.informe.builder;

import com.legall.inspeccion.domain.base.EstadoEnum;
import com.legall.inspeccion.domain.informe.Informe;
import com.legall.inspeccion.domain.informe.MotivoInformeEnum;
import com.legall.inspeccion.domain.inspeccion.Inspeccion;
import com.legall.inspeccion.domain.notificacion.ProgramacionFechas;

public class InformeBuilder {

    private Informe informe;

    public InformeBuilder() {
        this.informe = new Informe();
    }

    public InformeBuilder id(Long id) {
        this.informe.setId(id);
        return this;
    }

    public InformeBuilder inspeccionId(Long inspeccionId) {
        this.informe.setInspeccionId(inspeccionId);
        return this;
    }

    public InformeBuilder programacionFechas(ProgramacionFechas programacionFechas) {
        this.informe.setProgramacionFechas(programacionFechas);
        return this;
    }

    public InformeBuilder motivoInforme(MotivoInformeEnum motivoInforme) {
        this.informe.setMotivoInforme(motivoInforme);
        return this;
    }

    public InformeBuilder detalleInforme(String detalleInforme) {
        this.informe.setDetalleInforme(detalleInforme);
        return this;
    }

    public InformeBuilder estaAnulado(Boolean estaAnulado) {
        this.informe.setEstaAnulado(estaAnulado);
        return this;
    }

    public InformeBuilder estado(EstadoEnum estado) {
        this.informe.setEstado(estado);
        return this;
    }

    public Informe build() {
        return this.informe;
    }
}
