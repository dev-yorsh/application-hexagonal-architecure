package com.legall.inspeccion.application.ports.output.administracion.contratante;

import com.legall.inspeccion.application.ports.output.administracion.contratante.exception.ContratanteExceptionPort;

@FunctionalInterface
public interface ContratanteUpdateRazonSocialPort {

    void updateRazonSocial(Long id, String razonSocial) throws ContratanteExceptionPort;

}
