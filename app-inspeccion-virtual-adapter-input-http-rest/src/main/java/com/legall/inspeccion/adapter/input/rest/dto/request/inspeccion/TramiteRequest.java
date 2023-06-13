package com.legall.inspeccion.adapter.input.rest.dto.request.inspeccion;

import com.legall.inspeccion.adapter.input.rest.dto.request.administracion.AseguradoRequest;
import com.legall.inspeccion.adapter.input.rest.dto.request.administracion.ContratanteRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TramiteRequest {

    private String codigoTramite;
    private Integer condicionTramiteId;
    private ContratanteRequest contratante;
    private AseguradoRequest asegurado;
    private String observacion;

}
