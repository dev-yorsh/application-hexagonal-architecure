package com.legall.inspeccion.adapter.output.database.entity.notificacion;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "programacion_fechas", schema = "notificacion")
public class ProgramacionFechasEntityPostgres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "programacion_fechas_id")
    private Long programacionFechasId;

    @Column(name = "empleado_id")
    private Long empleadoId;

    @Column(name = "asegurado_id")
    private Long aseguradoId;

    @Column(name = "fecha_programada")
    private String fechaProgramada;

    @Column(name = "tiempo_inspeccion")
    private Integer tiempoInspeccion;

    @Column(name = "fecha_finalizacion")
    private String fechaFinalizacion;

    @Column(name = "esta_reservado")
    private Boolean estaReservado;

}
