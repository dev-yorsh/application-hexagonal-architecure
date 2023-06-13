package com.legall.inspeccion.application.ports.command;

import com.legall.inspeccion.domain.inspeccion.Inspeccion;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InspeccionSaveCommand {

    private Long tramiteId;
    private List<Inspeccion> inspecciones;

    public InspeccionSaveCommand() {
    }

    public InspeccionSaveCommand(Long tramiteId, List<Inspeccion> inspecciones) {
        this.tramiteId = tramiteId;
        this.inspecciones = inspecciones;
    }

    public Long getTramiteId() {
        return tramiteId;
    }

    public void setTramiteId(Long tramiteId) {
        this.tramiteId = tramiteId;
    }

    public List<Inspeccion> getInspecciones() {
        return inspecciones;
    }

    public void setInspecciones(List<Inspeccion> inspecciones) {
        this.inspecciones = inspecciones;
    }
}
