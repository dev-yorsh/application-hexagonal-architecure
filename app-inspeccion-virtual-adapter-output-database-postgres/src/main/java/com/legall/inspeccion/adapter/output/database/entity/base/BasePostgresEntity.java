package com.legall.inspeccion.adapter.output.database.entity.base;

import com.legall.inspeccion.domain.constantes.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BasePostgresEntity {

    @Column(name = "fecha_creacion", updatable = false)
    public LocalDateTime fechaCreacion;

    @Column(name = "creado_por", updatable = false)
    public String creadoPor;

    @Column(name = "fecha_modificacion")
    public LocalDateTime fechaModificacion;

    @Column(name = "modificado_por")
    public String modificadoPor;

    @Column(name = "estado")
    public String estado;

    @PrePersist
    private void prePersist() {
        this.creadoPor = Constants.USUARIO_DEFECTO;
        this.fechaCreacion = LocalDateTime.now();
    }

}
