package com.legall.inspeccion.adapter.output.database.entity.inspeccion.builder;

import com.legall.inspeccion.adapter.output.database.entity.administracion.AseguradoEntityPostgres;
import com.legall.inspeccion.adapter.output.database.entity.administracion.ContratanteEntityPostgres;
import com.legall.inspeccion.adapter.output.database.entity.inspeccion.TramiteEntityPostgres;

import java.time.LocalDateTime;

public class TramiteEntityBuilder {

    private TramiteEntityPostgres tramiteEntityPostgres;

    public TramiteEntityBuilder() {
        this.tramiteEntityPostgres = new TramiteEntityPostgres();
    }

    public TramiteEntityBuilder tramiteId(Long id) {
        this.tramiteEntityPostgres.setTramiteId(id);
        return this;
    }

    public TramiteEntityBuilder codigoTramite(String codigoTramite) {
        this.tramiteEntityPostgres.setCodigoTramite(codigoTramite);
        return this;
    }

    public TramiteEntityBuilder condicionTramiteId(Integer condicionTramiteId) {
        this.tramiteEntityPostgres.setCondicionTramiteId(condicionTramiteId);
        return this;
    }

    public TramiteEntityBuilder observacion(String observacion) {
        this.tramiteEntityPostgres.setObservacion(observacion);
        return this;
    }

    public TramiteEntityBuilder contratante(ContratanteEntityPostgres contratante) {
        this.tramiteEntityPostgres.setContratante(contratante);
        return this;
    }

    public TramiteEntityBuilder asegurado(AseguradoEntityPostgres asegurado) {
        this.tramiteEntityPostgres.setAsegurado(asegurado);
        return this;
    }

    public TramiteEntityBuilder fechaCreacion(LocalDateTime fechaCreacion) {
        this.tramiteEntityPostgres.setFechaCreacion(fechaCreacion);
        return this;
    }

    public TramiteEntityBuilder creadoPor(String creadoPor) {
        this.tramiteEntityPostgres.setCreadoPor(creadoPor);
        return this;
    }

    public TramiteEntityBuilder fechaModificacion(LocalDateTime fechaModificacion) {
        this.tramiteEntityPostgres.setFechaModificacion(fechaModificacion);
        return this;
    }

    public TramiteEntityBuilder modificadoPor(String modificadoPor) {
        this.tramiteEntityPostgres.setModificadoPor(modificadoPor);
        return this;
    }

    public TramiteEntityBuilder estado(String estado) {
        this.tramiteEntityPostgres.setEstado(estado);
        return this;
    }

    public TramiteEntityPostgres build() {
        return this.tramiteEntityPostgres;
    }

}
