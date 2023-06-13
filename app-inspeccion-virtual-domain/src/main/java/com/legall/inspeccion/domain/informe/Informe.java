package com.legall.inspeccion.domain.informe;

import com.legall.inspeccion.domain.base.BaseDomain;
import com.legall.inspeccion.domain.base.EstadoEnum;
import com.legall.inspeccion.domain.notificacion.ProgramacionFechas;

public final class Informe extends BaseDomain {

    Long inspeccionId;
    ProgramacionFechas programacionFechas;
    MotivoInformeEnum motivoInforme;
    String detalleInforme;
    Boolean estaAnulado;

    public Informe() {
    }

    public Informe(Long id, Long inspeccionId, ProgramacionFechas programacionFechas,
                   MotivoInformeEnum motivoInforme, String detalleInforme,
                   Boolean estaAnulado, EstadoEnum estado) {
        super(id, estado);
        this.inspeccionId = inspeccionId;
        this.programacionFechas = programacionFechas;
        this.motivoInforme = motivoInforme;
        this.detalleInforme = detalleInforme;
        this.estaAnulado = estaAnulado;
    }

    public Long getInspeccionId() {
        return inspeccionId;
    }

    public void setInspeccionId(Long inspeccionId) {
        this.inspeccionId = inspeccionId;
    }

    public ProgramacionFechas getProgramacionFechas() {
        return programacionFechas;
    }

    public void setProgramacionFechas(ProgramacionFechas programacionFechas) {
        this.programacionFechas = programacionFechas;
    }

    public MotivoInformeEnum getMotivoInforme() {
        return motivoInforme;
    }

    public void setMotivoInforme(MotivoInformeEnum motivoInforme) {
        this.motivoInforme = motivoInforme;
    }

    public String getDetalleInforme() {
        return detalleInforme;
    }

    public void setDetalleInforme(String detalleInforme) {
        this.detalleInforme = detalleInforme;
    }

    public Boolean getEstaAnulado() {
        return estaAnulado;
    }

    public void setEstaAnulado(Boolean estaAnulado) {
        this.estaAnulado = estaAnulado;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "inspeccionId=" + inspeccionId +
                ", programacionFechas=" + programacionFechas +
                ", motivoInforme=" + motivoInforme +
                ", detalleInforme='" + detalleInforme + '\'' +
                ", estaAnulado=" + estaAnulado +
                '}' + super.toString();
    }
}
