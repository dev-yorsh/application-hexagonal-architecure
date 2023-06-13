package com.legall.inspeccion.domain.inspeccion;

import com.legall.inspeccion.domain.administracion.Asegurado;
import com.legall.inspeccion.domain.administracion.Contratante;
import com.legall.inspeccion.domain.base.BaseDomain;
import com.legall.inspeccion.domain.base.EstadoEnum;

import java.time.LocalDateTime;
import java.util.Objects;

public final class Tramite extends BaseDomain {

    private String codigoTramite;
    private CondicionTramiteEnum condicionTramiteId;
    private Contratante contratante;
    private Asegurado asegurado;
    private String observacion;

    public Tramite() {
    }

    public Tramite(Long id, String codigoTramite, CondicionTramiteEnum condicionTramiteId, Contratante contratante,
                   Asegurado asegurado, String observacion, EstadoEnum estado, LocalDateTime fechaCreacion,
                   String creadoPor, LocalDateTime fechaModificacion, String modificadoPor) {
        super(id, estado, fechaCreacion, creadoPor, fechaModificacion, modificadoPor);
        this.codigoTramite = codigoTramite;
        this.condicionTramiteId = condicionTramiteId;
        this.contratante = contratante;
        this.asegurado = asegurado;
        this.observacion = observacion;
    }

    // Validaciones
    public static Boolean contratanteIsInvalid(Contratante contratante) {
        return Objects.isNull(contratante);
    }

    public static Boolean AseguradoIsInvalid(Asegurado asegurado) {
        return Objects.isNull(asegurado);
    }

    public String getCodigoTramite() {
        return codigoTramite;
    }

    public void setCodigoTramite(String codigoTramite) {
        this.codigoTramite = codigoTramite;
    }

    public CondicionTramiteEnum getCondicionTramite() {
        return condicionTramiteId;
    }

    public void setCondicionTramiteId(CondicionTramiteEnum condicionTramiteId) {
        this.condicionTramiteId = condicionTramiteId;
    }

    public Contratante getContratante() {
        return contratante;
    }

    public void setContratante(Contratante contratante) {
        this.contratante = contratante;
    }

    public Asegurado getAsegurado() {
        return asegurado;
    }

    public void setAsegurado(Asegurado asegurado) {
        this.asegurado = asegurado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "Tramite{" +
                "codigoTramite='" + codigoTramite + '\'' +
                ", condicionTramiteId=" + condicionTramiteId +
                ", contratante=" + contratante +
                ", asegurado=" + asegurado +
                ", observacion='" + observacion + '\'' +
                '}' + super.toString();
    }
}
