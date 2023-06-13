package com.legall.inspeccion.adapter.output.database.adapter.inspeccion;

import com.legall.inspeccion.adapter.output.database.entity.inspeccion.TramiteEntityPostgres;
import com.legall.inspeccion.adapter.output.database.mappers.inspeccion.TramiteMapper;
import com.legall.inspeccion.adapter.output.database.repository.inspeccion.TramitePostgresRepository;
import com.legall.inspeccion.application.ports.output.inspeccion.tramite.TramiteFindAllPort;
import com.legall.inspeccion.application.ports.output.inspeccion.tramite.TramiteFindByIdPort;
import com.legall.inspeccion.application.ports.output.inspeccion.tramite.TramiteSavePort;
import com.legall.inspeccion.application.ports.output.inspeccion.tramite.exception.TramiteExceptionPort;
import com.legall.inspeccion.domain.inspeccion.Tramite;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class TramitePostgresAdapter implements TramiteSavePort, TramiteFindAllPort, TramiteFindByIdPort {

    public TramitePostgresRepository tramitePostgresRepository;
    public TramiteMapper tramiteMapper;

    public TramitePostgresAdapter(TramitePostgresRepository tramitePostgresRepository,
                                  TramiteMapper tramiteMapper) {
        this.tramitePostgresRepository = tramitePostgresRepository;
        this.tramiteMapper = tramiteMapper;
    }


    @Override
    public List<Tramite> findAll() throws TramiteExceptionPort {
        try {
            List<TramiteEntityPostgres> tramiteEntityPostgres = tramitePostgresRepository.findAll();
            return tramiteMapper.toListDomain(tramiteEntityPostgres);
        } catch (Exception e) {
            throw new TramiteExceptionPort(e.getMessage());
        }
    }

    @Override
    public Optional<Tramite> findById(Long id) throws TramiteExceptionPort {
        try {
            return tramitePostgresRepository.findById(id).map(tramiteMapper::toDomain);
        } catch (Exception e) {
            throw new TramiteExceptionPort(e.getMessage());
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public Tramite save(Tramite tramite) throws TramiteExceptionPort {
        try {
            TramiteEntityPostgres tramiteSaved = tramitePostgresRepository.save(tramiteMapper.toEntity(tramite));
            return tramiteMapper.toDomain(tramiteSaved);
        } catch (Exception e) {
            throw new TramiteExceptionPort(e.getMessage(), e.getCause());
        }
    }
}
