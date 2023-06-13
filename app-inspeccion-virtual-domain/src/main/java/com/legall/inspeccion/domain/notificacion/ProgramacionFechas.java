package com.legall.inspeccion.domain.notificacion;

public final class ProgramacionFechas {

    private Long id;
    private Long empleadoId;
    private Long aseguradoId;
    private String fechaProgramada;
    private Integer tiempoInspeccion;
    private String fechaFinalizacion;
    private Boolean estaReservado;

    public ProgramacionFechas() {
    }

    public ProgramacionFechas(Long id, Long empleadoId, Long aseguradoId, String fechaProgramada,
                              Integer tiempoInspeccion, String fechaFinalizacion, Boolean estaReservado) {
        this.id = id;
        this.empleadoId = empleadoId;
        this.aseguradoId = aseguradoId;
        this.fechaProgramada = fechaProgramada;
        this.tiempoInspeccion = tiempoInspeccion;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estaReservado = estaReservado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Long empleadoId) {
        this.empleadoId = empleadoId;
    }

    public Long getAseguradoId() {
        return aseguradoId;
    }

    public void setAseguradoId(Long aseguradoId) {
        this.aseguradoId = aseguradoId;
    }

    public String getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(String fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public Integer getTiempoInspeccion() {
        return tiempoInspeccion;
    }

    public void setTiempoInspeccion(Integer tiempoInspeccion) {
        this.tiempoInspeccion = tiempoInspeccion;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public Boolean getEstaReservado() {
        return estaReservado;
    }

    public void setEstaReservado(Boolean estaReservado) {
        this.estaReservado = estaReservado;
    }

    @Override
    public String toString() {
        return "ProgramacionFechas{" +
                "id=" + id +
                ", empleadoId=" + empleadoId +
                ", aseguradoId=" + aseguradoId +
                ", fechaProgramada='" + fechaProgramada + '\'' +
                ", tiempoInspeccion=" + tiempoInspeccion +
                ", fechaFinalizacion='" + fechaFinalizacion + '\'' +
                ", estaReservado=" + estaReservado +
                '}';
    }
}
