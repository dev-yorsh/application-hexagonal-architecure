package com.legall.inspeccion.adapter.output.database.adapter.informe;

import com.legall.inspeccion.adapter.output.database.entity.informe.InformeEntityPostgres;
import com.legall.inspeccion.adapter.output.database.mappers.informe.InformeMapper;
import com.legall.inspeccion.adapter.output.database.repository.informe.InformePostgresRepository;
import com.legall.inspeccion.application.ports.output.informe.exception.InformePortException;
import com.legall.inspeccion.application.ports.output.informe.informe.InformeSavePort;
import com.legall.inspeccion.domain.informe.Informe;

public class InformePostgresAdapter implements InformeSavePort {

    private final InformePostgresRepository informePostgresRepository;
    public final InformeMapper informeMapper;

    public InformePostgresAdapter(InformePostgresRepository informePostgresRepository, InformeMapper informeMapper) {
        this.informePostgresRepository = informePostgresRepository;
        this.informeMapper = informeMapper;
    }

    @Override
    public Informe save(Informe informe) throws InformePortException {
        try {
            InformeEntityPostgres informeEntityPostgres = informePostgresRepository.save(informeMapper.toEntity(informe));
            return informeMapper.toDomain(informeEntityPostgres);
        } catch (Exception e) {
            throw new InformePortException(e.getMessage(), e.getCause());
        }
    }
}