package com.legall.inspeccion.domain.administracion;

import com.legall.inspeccion.domain.base.BaseDomain;
import com.legall.inspeccion.domain.base.EstadoEnum;

public final class Sucursal extends BaseDomain {

    private TipoDocumentoEnum tipoSucursalId;
    private String nombre;
    private String distritoId;
    private String direccion;
    private String telefono_fijo;

    public Sucursal() {
        super();
    }

    public Sucursal(Long id, TipoDocumentoEnum tipoSucursalId, String nombre, String distritoId,
                    String direccion, String telefono_fijo, EstadoEnum estado) {
        super(id, estado);
        this.tipoSucursalId = tipoSucursalId;
        this.nombre = nombre;
        this.distritoId = distritoId;
        this.direccion = direccion;
        this.telefono_fijo = telefono_fijo;
    }

    public TipoDocumentoEnum getTipoSucursalId() {
        return tipoSucursalId;
    }

    public void setTipoSucursalId(TipoDocumentoEnum tipoSucursalId) {
        this.tipoSucursalId = tipoSucursalId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDistritoId() {
        return distritoId;
    }

    public void setDistritoId(String distritoId) {
        this.distritoId = distritoId;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(String telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                ", tipoSucursalId=" + tipoSucursalId +
                ", nombre='" + nombre + '\'' +
                ", distritoId='" + distritoId + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono_fijo='" + telefono_fijo + '\'' +
                '}' + super.toString();
    }
}
