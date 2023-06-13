package com.legall.inspeccion.application.ports.input.informe;

import com.legall.inspeccion.application.ports.input.informe.exception.InformeUseCaseException;
import com.legall.inspeccion.domain.informe.Informe;

@FunctionalInterface
public interface InformeSaveUseCase {

    Informe save(Informe informe) throws InformeUseCaseException;
}
