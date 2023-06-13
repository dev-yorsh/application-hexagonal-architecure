package com.legall.inspeccion.application.ports.command;

import com.legall.inspeccion.domain.administracion.Empleado;
import com.legall.inspeccion.domain.notificacion.ProgramacionFechas;

public class InformeReprogramarCommand {

    private Empleado empleado;
    private ProgramacionFechas programacionFechasInspeccion;

    public InformeReprogramarCommand(Empleado empleado, ProgramacionFechas programacionFechasInspeccion) {
        this.empleado = empleado;
        this.programacionFechasInspeccion = programacionFechasInspeccion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public ProgramacionFechas getProgramacionInspeccion() {
        return programacionFechasInspeccion;
    }

    public void setProgramacionInspeccion(ProgramacionFechas programacionFechasInspeccion) {
        this.programacionFechasInspeccion = programacionFechasInspeccion;
    }
}
