package com.legall.inspeccion.adapter.output.database.adapter.administracion;

import com.legall.inspeccion.adapter.output.database.entity.administracion.ContratanteEntityPostgres;
import com.legall.inspeccion.adapter.output.database.mappers.administracion.ContratanteMapper;
import com.legall.inspeccion.adapter.output.database.repository.administracion.ContratantePostgresRepository;
import com.legall.inspeccion.application.ports.output.administracion.contratante.ContratanteFindByDocumentPort;
import com.legall.inspeccion.application.ports.output.administracion.contratante.ContratanteFindByIdPort;
import com.legall.inspeccion.application.ports.output.administracion.contratante.ContratanteSavePort;
import com.legall.inspeccion.application.ports.output.administracion.contratante.ContratanteUpdateRazonSocialPort;
import com.legall.inspeccion.application.ports.output.administracion.contratante.exception.ContratanteExceptionPort;
import com.legall.inspeccion.domain.administracion.Contratante;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static com.legall.inspeccion.adapter.output.database.constants.MessageConstants.ErrorConstants.CONTRATANTE_ERROR_SAVE;

public class ContratantePostgresAdapter implements ContratanteSavePort, ContratanteFindByIdPort,
        ContratanteFindByDocumentPort, ContratanteUpdateRazonSocialPort {

    public ContratantePostgresRepository contratantePostgresRepository;
    public ContratanteMapper contratanteMapper;

    public ContratantePostgresAdapter(ContratantePostgresRepository contratantePostgresRepository,
                                      ContratanteMapper contratanteMapper) {
        this.contratantePostgresRepository = contratantePostgresRepository;
        this.contratanteMapper = contratanteMapper;
    }

    @Override
    public Optional<Contratante> findByDocument(String document) throws ContratanteExceptionPort {
        try {
            return contratantePostgresRepository.findByNumeroDocumento(document)
                    .map(contratanteMapper::toDomain);
        } catch (Exception e) {
            throw new ContratanteExceptionPort(e.getMessage());
        }
    }

    @Override
    public Optional<Contratante> findById(Long id) throws ContratanteExceptionPort {
        try {
            return contratantePostgresRepository.findById(id)
                    .map(contratanteMapper::toDomain);
        } catch (Exception e) {
            throw new ContratanteExceptionPort(e.getMessage());
        }
    }

    @Override
    public Contratante save(Contratante contratante) throws ContratanteExceptionPort {
        try {
            ContratanteEntityPostgres savedContratante = contratantePostgresRepository
                    .save(contratanteMapper.toEntity(contratante));
            return contratanteMapper.toDomain(savedContratante);
        } catch (Exception e) {
            throw new ContratanteExceptionPort(CONTRATANTE_ERROR_SAVE);
        }
    }

    @Transactional
    @Override
    public void updateRazonSocial(Long id, String razonSocial) throws ContratanteExceptionPort {
        try {
            contratantePostgresRepository.updateRazonSocial(id, razonSocial);
        } catch (Exception e) {
            throw new ContratanteExceptionPort(e.getMessage());
        }
    }
}
