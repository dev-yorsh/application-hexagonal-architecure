package com.legall.inspeccion.adapter.output.database.entity.administracion;

import com.legall.inspeccion.adapter.output.database.entity.base.BasePostgresEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "asegurado", schema = "administracion")
public class AseguradoEntityPostgres extends BasePostgresEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asegurado_id")
    private Long aseguradoId;

    @Column(name = "parametro_tipo_documento_id")
    private Integer tipoDocumentoId;

    @Column(name = "numero_documento")
    private String numeroDocumento;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido_paterno")
    private String apellidoPaterno;

    @Column(name = "apellido_materno")
    private String apellidoMaterno;

    @Column(name = "domicilio")
    private String domicilio;

    @Column(name = "referencia_domicilio")
    private String referenciaDomicilio;

    @Column(name = "distrito_id")
    private Integer distritoId;

    @Column(name = "telefono_movil")
    private String telefonoMovil;

    @Column(name = "telefono_fijo")
    private String telefonoFijo;

    @Column(name = "correo_electronico")
    private String correo;

}
