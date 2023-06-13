package com.legall.inspeccion.adapter.output.database.entity.informe;

import com.legall.inspeccion.adapter.output.database.entity.base.BasePostgresEntity;
import com.legall.inspeccion.adapter.output.database.entity.notificacion.ProgramacionFechasEntityPostgres;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "informe", schema = "informe")
public class InformeEntityPostgres extends BasePostgresEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "informe_id")
    private Long informeId;

    @Column(name = "inspeccion_id")
    private Long inspeccionId;

    @ManyToOne
    @JoinColumn(name = "programacion_fechas_id")
    private ProgramacionFechasEntityPostgres programacionFechas;

    @Column(name = "parametro_motivo_informe_id")
    private Integer motivoInformeId;

    @Column(name = "detalle_informe")
    private String detalleInforme;

    @Column(name = "esta_anulado")
    private Boolean estaAnulado;


    // PROGRAMACION DE FECHAS
}
