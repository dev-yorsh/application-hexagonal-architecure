package com.legall.inspeccion.domain.base.utilenum;

import com.legall.inspeccion.domain.administracion.TipoDocumentoEnum;
import com.legall.inspeccion.domain.base.EstadoEnum;
import com.legall.inspeccion.domain.base.utilenum.exception.EnumIlegalValueException;
import com.legall.inspeccion.domain.constantes.MensajeConstante;
import com.legall.inspeccion.domain.informe.MotivoInformeEnum;
import com.legall.inspeccion.domain.inspeccion.CondicionTramiteEnum;
import com.legall.inspeccion.domain.inspeccion.EstadoInspeccionEnum;

public class EnumValue {

    public static TipoDocumentoEnum documentoEnumValue(Integer id) {
        return TipoDocumentoEnum.getDocumentId(id).orElseThrow(() ->
                new EnumIlegalValueException(MensajeConstante.MENSAJE_ENUM_DOCUMENTO_ERROR + " " + id));
    }

    public static CondicionTramiteEnum condicionEnumValue(Integer id) {
        return CondicionTramiteEnum.getCondicionId(id).orElseThrow(() ->
                new EnumIlegalValueException(MensajeConstante.MENSAJE_ENUM_CONDICION_ERROR + " " + id));
    }

    public static EstadoEnum estadoEnumValue(String id) {
        return EstadoEnum.getEstadoId(id).orElseThrow(() ->
                new EnumIlegalValueException(MensajeConstante.MENSAJE_ENUM_ESTADO_ERROR + " " + id));
    }

    public static MotivoInformeEnum motivoInformeEnum(Integer id){
        return MotivoInformeEnum.getMotivoId(id).orElseThrow(() ->
                new EnumIlegalValueException(MensajeConstante.MENSAJE_ENUM_MOTIVO_INFORME_ERROR + " " + id));
    }

    public static EstadoInspeccionEnum estadoInspeccionEnum(Integer id){
        return EstadoInspeccionEnum.getEstadoInspeccionId(id).orElseThrow(() ->
                new EnumIlegalValueException(MensajeConstante.MENSAJE_ENUM_ESTADO_INSPECCION_ERROR + " " + id));
    }

}
