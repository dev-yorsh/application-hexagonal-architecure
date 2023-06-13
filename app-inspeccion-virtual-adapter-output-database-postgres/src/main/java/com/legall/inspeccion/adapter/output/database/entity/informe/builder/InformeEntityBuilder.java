package com.legall.inspeccion.adapter.output.database.entity.informe.builder;

import com.legall.inspeccion.adapter.output.database.entity.informe.InformeEntityPostgres;
import com.legall.inspeccion.adapter.output.database.entity.notificacion.ProgramacionFechasEntityPostgres;
import com.legall.inspeccion.domain.base.EstadoEnum;
import com.legall.inspeccion.domain.notificacion.ProgramacionFechas;

public class InformeEntityBuilder {

    private InformeEntityPostgres informeEntityPostgres;

    public InformeEntityBuilder() {
        this.informeEntityPostgres = new InformeEntityPostgres();
    }

    public InformeEntityBuilder informeId(Long informeId) {
        this.informeEntityPostgres.setInformeId(informeId);
        return this;
    }

    public InformeEntityBuilder inspeccionId(Long inspeccionId) {
        this.informeEntityPostgres.setInspeccionId(inspeccionId);
        return this;
    }

    public InformeEntityBuilder programacionFechas(ProgramacionFechasEntityPostgres programacionFechas) {
        this.informeEntityPostgres.setProgramacionFechas(programacionFechas);
        return this;
    }

    public InformeEntityBuilder motivoInformeId(Integer motivoInformeId) {
        this.informeEntityPostgres.setMotivoInformeId(motivoInformeId);
        return this;
    }

    public InformeEntityBuilder detalleInforme(String detalleInforme) {
        this.informeEntityPostgres.setDetalleInforme(detalleInforme);
        return this;
    }

    public InformeEntityBuilder estaAnulado(Boolean estaAnulado) {
        this.informeEntityPostgres.setEstaAnulado(estaAnulado);
        return this;
    }

    public InformeEntityBuilder estado(String estado) {
        this.informeEntityPostgres.setEstado(estado);
        return this;
    }

    public InformeEntityPostgres build() {
        return this.informeEntityPostgres;
    }

}
