package com.legall.inspeccion.adapter.output.database.entity.inspeccion;

import com.legall.inspeccion.adapter.output.database.entity.administracion.AseguradoEntityPostgres;
import com.legall.inspeccion.adapter.output.database.entity.administracion.ContratanteEntityPostgres;
import com.legall.inspeccion.adapter.output.database.entity.base.BasePostgresEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tramite", schema = "inspeccion")
public class TramiteEntityPostgres extends BasePostgresEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tramite_id")
    private Long tramiteId;

    @Column(name = "codigo_tramite", unique = true)
    private String codigoTramite;

    @Column(name = "parametro_condicion_tramite_id")
    private Integer condicionTramiteId;

    @Column(name = "observacion")
    private String observacion;

    @ManyToOne
    @JoinColumn(name = "contratante_id")
    private ContratanteEntityPostgres contratante;

    @ManyToOne
    @JoinColumn(name = "asegurado_id")
    private AseguradoEntityPostgres asegurado;

}
