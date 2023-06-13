package com.legall.inspeccion.adapter.output.database.adapter.inspeccion;

import com.legall.inspeccion.adapter.output.database.mappers.inspeccion.InspeccionMapper;
import com.legall.inspeccion.adapter.output.database.repository.inspeccion.InspeccionPostgresRepository;
import com.legall.inspeccion.application.ports.output.inspeccion.inspeccion.InspeccionSavePort;
import com.legall.inspeccion.application.ports.output.inspeccion.inspeccion.exception.InspeccionPortException;
import com.legall.inspeccion.domain.inspeccion.Inspeccion;
import org.springframework.transaction.annotation.Transactional;

public class InspeccionPostgresAdapter implements InspeccionSavePort {

    private final InspeccionPostgresRepository inspeccionPostgresRepository;
    private final InspeccionMapper inspeccionMapper;

    public InspeccionPostgresAdapter(InspeccionPostgresRepository inspeccionPostgresRepository,
                                     InspeccionMapper inspeccionMapper) {
        this.inspeccionPostgresRepository = inspeccionPostgresRepository;
        this.inspeccionMapper = inspeccionMapper;
    }

    @Transactional
    @Override
    public Inspeccion save(Inspeccion inspeccion) throws InspeccionPortException {
        try {
            return inspeccionMapper.toDomain(inspeccionPostgresRepository
                    .save(inspeccionMapper.toEntity(inspeccion)));
        } catch (Exception e) {
            throw new InspeccionPortException(e.getMessage(), e.getCause());
        }
    }
}
