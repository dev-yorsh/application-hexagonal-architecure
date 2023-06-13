package com.legall.inspeccion.adapter.output.database.entity.inspeccion;


import com.legall.inspeccion.adapter.output.database.entity.base.BasePostgresEntity;
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
@Table(name = "inspeccion", schema = "inspeccion")
public class InspeccionEntityPostgres extends BasePostgresEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inspeccion_id")
    private Long inspeccionId;

    @Column(name = "tramite_id")
    private Long tramiteId;

    @ManyToOne
    @JoinColumn(name = "vehiculo_id")
    private VehiculoEntityPostgres vehiculo;

    @Column(name = "codigo_inspeccion")
    private String codigoInspeccion;

    @Column(name = "parametro_estado_inspeccion_id")
    private Integer estadoInspeccionId;

    @Column(name = "observacion")
    private String observacion;

}
