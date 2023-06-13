package com.legall.inspeccion.domain.inspeccion.builder;

import com.legall.inspeccion.domain.administracion.Asegurado;
import com.legall.inspeccion.domain.administracion.Contratante;
import com.legall.inspeccion.domain.base.EstadoEnum;
import com.legall.inspeccion.domain.inspeccion.CondicionTramiteEnum;
import com.legall.inspeccion.domain.inspeccion.Tramite;

import java.time.LocalDateTime;

public class TramiteBuilder {

    private Tramite tramite;

    public TramiteBuilder() {
        tramite = new Tramite();
    }

    public TramiteBuilder id(Long id) {
        tramite.setId(id);
        return this;
    }

    public TramiteBuilder codigoTramite(String codigoTramite) {
        tramite.setCodigoTramite(codigoTramite);
        return this;
    }

    public TramiteBuilder condicionTramite(CondicionTramiteEnum condicionTramiteId) {
        tramite.setCondicionTramiteId(condicionTramiteId);
        return this;
    }

    public TramiteBuilder contratante(Contratante contratante) {
        tramite.setContratante(contratante);
        return this;
    }

    public TramiteBuilder asegurado(Asegurado asegurado) {
        tramite.setAsegurado(asegurado);
        return this;
    }

    public TramiteBuilder observacion(String observacion) {
        tramite.setObservacion(observacion);
        return this;
    }

    public TramiteBuilder fechaCreacion(LocalDateTime fechaCreacion) {
        tramite.setFechaCreacion(fechaCreacion);
        return this;
    }

    public TramiteBuilder creadoPor(String creadoPor) {
        tramite.setCreadoPor(creadoPor);
        return this;
    }

   public TramiteBuilder fechaModificacion(LocalDateTime fechaModificacion) {
        tramite.setFechaModificacion(fechaModificacion);
        return this;
    }

    public TramiteBuilder modificadoPor(String modificadoPor) {
        tramite.setModificadoPor(modificadoPor);
        return this;
    }


    public TramiteBuilder estado(EstadoEnum estado) {
        tramite.setEstado(estado);
        return this;
    }

    public Tramite build() {
        return this.tramite;
    }
}
