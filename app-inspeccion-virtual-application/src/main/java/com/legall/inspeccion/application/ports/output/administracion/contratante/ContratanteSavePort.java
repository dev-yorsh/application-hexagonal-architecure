package com.legall.inspeccion.application.ports.output.administracion.contratante;

import com.legall.inspeccion.application.ports.output.administracion.contratante.exception.ContratanteExceptionPort;
import com.legall.inspeccion.domain.administracion.Contratante;

@FunctionalInterface
public interface ContratanteSavePort {

    Contratante save(Contratante contratante) throws ContratanteExceptionPort;
}
