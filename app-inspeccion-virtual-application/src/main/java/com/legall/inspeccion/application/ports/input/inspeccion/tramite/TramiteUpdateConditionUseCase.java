package com.legall.inspeccion.application.ports.input.inspeccion.tramite;

import com.legall.inspeccion.application.ports.input.inspeccion.tramite.exception.TramiteUseCaseException;

@FunctionalInterface
public interface TramiteUpdateConditionUseCase {

    void updateCondition(Long tramiteId, Integer conditionId) throws TramiteUseCaseException;
}
