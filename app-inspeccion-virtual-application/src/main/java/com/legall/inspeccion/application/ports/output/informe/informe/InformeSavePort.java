package com.legall.inspeccion.application.ports.output.informe.informe;

import com.legall.inspeccion.application.ports.output.informe.exception.InformePortException;
import com.legall.inspeccion.domain.informe.Informe;

@FunctionalInterface
public interface InformeSavePort {

    Informe save(Informe informe) throws InformePortException;
}
