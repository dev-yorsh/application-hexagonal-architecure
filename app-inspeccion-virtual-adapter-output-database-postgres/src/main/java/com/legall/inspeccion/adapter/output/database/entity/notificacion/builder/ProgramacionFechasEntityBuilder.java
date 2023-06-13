package com.legall.inspeccion.adapter.output.database.entity.notificacion.builder;

import com.legall.inspeccion.adapter.output.database.entity.notificacion.ProgramacionFechasEntityPostgres;

public class ProgramacionFechasEntityBuilder {

    private ProgramacionFechasEntityPostgres programacionFechasEntityPostgres;

    public ProgramacionFechasEntityBuilder() {
        programacionFechasEntityPostgres = new ProgramacionFechasEntityPostgres();
    }

    public ProgramacionFechasEntityBuilder id(Long id) {
        programacionFechasEntityPostgres.setProgramacionFechasId(id);
        return this;
    }

    public ProgramacionFechasEntityBuilder empleadoId(Long empleadoId) {
        programacionFechasEntityPostgres.setEmpleadoId(empleadoId);
        return this;
    }

    public ProgramacionFechasEntityBuilder aseguradoId(Long aseguradoId) {
        programacionFechasEntityPostgres.setAseguradoId(aseguradoId);
        return this;
    }

    public ProgramacionFechasEntityBuilder fechaProgramada(String fechaProgramada) {
        programacionFechasEntityPostgres.setFechaProgramada(fechaProgramada);
        return this;
    }

    public ProgramacionFechasEntityBuilder tiempoInspeccion(Integer tiempoInspeccion) {
        programacionFechasEntityPostgres.setTiempoInspeccion(tiempoInspeccion);
        return this;
    }

    public ProgramacionFechasEntityBuilder fechaFinalizacion(String fechaFinalizacion) {
        programacionFechasEntityPostgres.setFechaFinalizacion(fechaFinalizacion);
        return this;
    }

    public ProgramacionFechasEntityBuilder estaReservado(Boolean estaReservado) {
        programacionFechasEntityPostgres.setEstaReservado(estaReservado);
        return this;
    }

    public ProgramacionFechasEntityPostgres build() {
        return programacionFechasEntityPostgres;
    }

}
