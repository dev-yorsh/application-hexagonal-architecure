package com.legall.inspeccion.adapter.output.database.adapter.administracion;

import com.legall.inspeccion.adapter.output.database.mappers.administracion.AseguradoMapper;
import com.legall.inspeccion.adapter.output.database.repository.administracion.AseguradoPostgresRepository;
import com.legall.inspeccion.application.ports.output.administracion.asegurado.AseguradoFindByDocumentPort;
import com.legall.inspeccion.application.ports.output.administracion.asegurado.AseguradoSavePort;
import com.legall.inspeccion.application.ports.output.administracion.asegurado.exception.AseguradoExceptionPort;
import com.legall.inspeccion.domain.administracion.Asegurado;

import java.util.Optional;

import static com.legall.inspeccion.adapter.output.database.constants.MessageConstants.ErrorConstants.ASEGURADO_ERROR_SAVE;

public class AseguradoPostgresAdapter implements AseguradoSavePort, AseguradoFindByDocumentPort {

    public AseguradoPostgresRepository aseguradoPostgresRepository;
    public AseguradoMapper aseguradoMapper;

    public AseguradoPostgresAdapter(AseguradoPostgresRepository aseguradoPostgresRepository,
                                    AseguradoMapper aseguradoMapper) {
        this.aseguradoPostgresRepository = aseguradoPostgresRepository;
        this.aseguradoMapper = aseguradoMapper;
    }

    @Override
    public Optional<Asegurado> findByDocument(String documentNumber) throws AseguradoExceptionPort {
        try {
            return aseguradoPostgresRepository.findByNumeroDocumento(documentNumber)
                    .map(aseguradoMapper::toDomain);
        } catch (Exception e) {
            throw new AseguradoExceptionPort(e.getMessage());
        }
    }

    @Override
    public Asegurado save(Asegurado asegurado) throws AseguradoExceptionPort {
        try {
            return aseguradoMapper.toDomain(aseguradoPostgresRepository
                    .save(aseguradoMapper.toEntity(asegurado)));
        } catch (Exception e) {
            throw new AseguradoExceptionPort(ASEGURADO_ERROR_SAVE + e.getMessage());
        }
    }
}
