package com.legall.inspeccion.domain.notificacion.builder;

import com.legall.inspeccion.domain.notificacion.ProgramacionFechas;

import java.time.LocalDateTime;

public class ProgramacionFechasBuilder {

    private ProgramacionFechas programacionFechas;

    public ProgramacionFechasBuilder() {
        this.programacionFechas = new ProgramacionFechas();
    }

    public ProgramacionFechasBuilder id(Long id) {
        this.programacionFechas.setId(id);
        return this;
    }

    public ProgramacionFechasBuilder empleadoId(Long empleadoId) {
        this.programacionFechas.setEmpleadoId(empleadoId);
        return this;
    }

    public ProgramacionFechasBuilder aseguradoId(Long aseguradoId) {
        this.programacionFechas.setAseguradoId(aseguradoId);
        return this;
    }

    public ProgramacionFechasBuilder fechaProgramada(String fechaProgramada) {
        this.programacionFechas.setFechaProgramada(fechaProgramada);
        return this;
    }

    public ProgramacionFechasBuilder tiempoInspeccion(Integer tiempoInspeccion) {
        this.programacionFechas.setTiempoInspeccion(tiempoInspeccion);
        return this;
    }

    public ProgramacionFechasBuilder fechaFinalizacion(String fechaFinalizacion) {
        this.programacionFechas.setFechaFinalizacion(fechaFinalizacion);
        return this;
    }

    public ProgramacionFechasBuilder estaReservado(Boolean estaReservado) {
        this.programacionFechas.setEstaReservado(estaReservado);
        return this;
    }

    public ProgramacionFechas build() {
        return this.programacionFechas;
    }
}
