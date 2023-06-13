package com.legall.inspeccion.adapter.output.database.entity.administracion;

import com.legall.inspeccion.adapter.output.database.entity.base.BasePostgresEntity;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "contratante", schema = "administracion")
public class ContratanteEntityPostgres extends BasePostgresEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contratante_id")
    private Long contratanteId;

    @Column(name = "parametro_tipo_documento_id")
    private Integer tipoDocumentoId;

    @Column(name = "numero_documento")
    private String numeroDocumento;

    @Column(name = "razon_social")
    private String razonSocial;

    @Column(name = "domicilio")
    private String domicilio;

    @Column(name = "distrito_id")
    private Integer distritoId;

    @Column(name = "telefono_movil")
    private String telefonoMovil;

    @Column(name = "telefono_fijo")
    private String telefonoFijo;

    @Column(name = "correo_electronico")
    private String correo;

}

