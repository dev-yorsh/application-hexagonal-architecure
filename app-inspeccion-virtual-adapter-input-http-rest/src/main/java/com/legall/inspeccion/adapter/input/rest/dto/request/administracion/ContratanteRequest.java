package com.legall.inspeccion.adapter.input.rest.dto.request.administracion;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ContratanteRequest {

    private Long contratanteId;
    private Integer tipoDocumentoId;
    private String numeroDocumento;
    private String razonSocial;
    private Integer distritoId;
    private String domicilio;
    private String telefonoMovil;
    private String telefonoFijo;
    private String correo;
}
