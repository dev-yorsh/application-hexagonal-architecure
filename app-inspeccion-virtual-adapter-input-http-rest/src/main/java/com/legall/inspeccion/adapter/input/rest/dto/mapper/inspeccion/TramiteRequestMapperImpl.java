package com.legall.inspeccion.adapter.input.rest.dto.mapper.inspeccion;

import com.legall.inspeccion.adapter.input.rest.dto.mapper.administracion.AseguradoRequestMapper;
import com.legall.inspeccion.adapter.input.rest.dto.mapper.administracion.ContratanteRequestMapper;
import com.legall.inspeccion.adapter.input.rest.dto.request.inspeccion.TramiteRequest;
import com.legall.inspeccion.domain.inspeccion.Tramite;
import com.legall.inspeccion.domain.inspeccion.builder.TramiteBuilder;
import org.springframework.stereotype.Component;

import static com.legall.inspeccion.domain.base.utilenum.EnumValue.condicionEnumValue;


@Component
public class TramiteRequestMapperImpl implements TramiteRequestMapper {

    private final ContratanteRequestMapper contratanteRequestMapper;
    private final AseguradoRequestMapper aseguradoRequestMapper;

    public TramiteRequestMapperImpl(ContratanteRequestMapper contratanteRequestMapper,
                                    AseguradoRequestMapper aseguradoRequestMapper) {
        this.contratanteRequestMapper = contratanteRequestMapper;
        this.aseguradoRequestMapper = aseguradoRequestMapper;
    }

    @Override
    public Tramite toModel(TramiteRequest request) {
        return new TramiteBuilder()
                .codigoTramite(request.getCodigoTramite())
                .condicionTramite(condicionEnumValue(request.getCondicionTramiteId()))
                .contratante(contratanteRequestMapper.toModel(request.getContratante()))
                .asegurado(aseguradoRequestMapper.toModel(request.getAsegurado()))
                .observacion(request.getObservacion())
                .build();
    }


}
