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
@Table(name = "vehiculo", schema = "inspeccion")
public class VehiculoEntityPostgres extends BasePostgresEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehiculo_id")
    private Long vehiculoId;

    @Column(name = "marca_id")
    private Long marcaId;

    @Column(name = "placa")
    private String placa;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "anio")
    private Integer anio;

    @Column(name = "color")
    private String color;

    @Column(name = "numero_motor")
    private String numeroMotor;

    @Column(name = "vin")
    private String vin;

    @Column(name = "numero_cilindro")
    private Integer numeroCilindro;

    @Column(name = "numero_puerta")
    private Integer numeroPuerta;

    @Column(name = "kilometraje")
    private Integer kilometraje;

    @Column(name = "presenta_danios")
    private Boolean presentaDanios;

    @Column(name = "detalle_danios")
    private String detalleDanios;

    @Column(name = "observacion")
    private String observacion;

}
