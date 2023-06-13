package com.legall.inspeccion.application.ports.input.inspeccion.inspeccion;

import com.legall.inspeccion.application.ports.command.InspeccionSaveCommand;
import com.legall.inspeccion.application.ports.input.inspeccion.inspeccion.exception.InspeccionUseCaseException;
import com.legall.inspeccion.domain.inspeccion.Inspeccion;

import java.util.List;

@FunctionalInterface
public interface InspeccionSaveUseCase {

    Boolean save(InspeccionSaveCommand inspeccionSaveCommand) throws InspeccionUseCaseException;
}
