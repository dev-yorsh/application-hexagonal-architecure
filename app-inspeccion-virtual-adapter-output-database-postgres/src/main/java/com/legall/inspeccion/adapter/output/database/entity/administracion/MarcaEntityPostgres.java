package com.legall.inspeccion.adapter.output.database.entity.administracion;

import com.legall.inspeccion.adapter.output.database.entity.base.BasePostgresEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "marca", schema = "administracion")
public final class MarcaEntityPostgres extends BasePostgresEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "marca_id")
    private Long marcaId;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "prefijo")
    private String prefijo;

    public MarcaEntityPostgres(Long marcaId, String nombre, String prefijo) {
        this.marcaId = marcaId;
        this.nombre = nombre;
        this.prefijo = prefijo;
    }

    public MarcaEntityPostgres() {
    }

    public Long getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Long marcaId) {
        this.marcaId = marcaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }
}
