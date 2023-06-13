package com.legall.inspeccion.adapter.input.rest.dto.request.administracion;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AseguradoRequest {

    private Long aseguradoId;
    private Integer tipoDocumentoId;
    private String numeroDocumento;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Integer distritoId;
    private String domicilio;
    private String referenciaDomicilio;
    private String telefonoMovil;
    private String telefonoFijo;
    private String correo;

}
