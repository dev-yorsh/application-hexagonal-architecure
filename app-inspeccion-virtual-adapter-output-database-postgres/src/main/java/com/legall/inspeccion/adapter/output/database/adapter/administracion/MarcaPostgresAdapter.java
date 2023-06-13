package com.legall.inspeccion.adapter.output.database.adapter.administracion;

import com.legall.inspeccion.adapter.output.database.entity.administracion.MarcaEntityPostgres;
import com.legall.inspeccion.adapter.output.database.mappers.administracion.MarcaMapper;
import com.legall.inspeccion.adapter.output.database.repository.administracion.MarcaPostgresRepository;
import com.legall.inspeccion.application.ports.output.administracion.marca.MarcaFindAllPort;
import com.legall.inspeccion.application.ports.output.administracion.marca.MarcaFindByIdPort;
import com.legall.inspeccion.application.ports.output.administracion.marca.MarcaFindByNamePort;
import com.legall.inspeccion.application.ports.output.administracion.marca.MarcaSavePort;
import com.legall.inspeccion.application.ports.output.administracion.marca.exception.MarcaExceptionPort;
import com.legall.inspeccion.domain.administracion.Marca;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.legall.inspeccion.adapter.output.database.constants.MessageConstants.ErrorConstants.MARCA_ERROR_SAVE;

public class MarcaPostgresAdapter implements MarcaSavePort, MarcaFindAllPort, MarcaFindByIdPort, MarcaFindByNamePort {

    public MarcaPostgresRepository marcaPostgresRepository;
    public MarcaMapper marcaMapper;

    public MarcaPostgresAdapter(MarcaPostgresRepository marcaPostgresRepository,
                                MarcaMapper marcaMapper) {
        this.marcaPostgresRepository = marcaPostgresRepository;
        this.marcaMapper = marcaMapper;
    }

    @Override
    public List<Marca> findAll() throws MarcaExceptionPort {
        System.out.println("EJECUTANDO DESDE MARCA POSTGRES ADAPTER");
        List<MarcaEntityPostgres> marcaEntity = marcaPostgresRepository.findAll();

        if (!marcaEntity.isEmpty()) {
            return marcaMapper.toListDomain(marcaEntity);
        }
        return new ArrayList<>();
    }

    @Override
    public Marca save(Marca marca) throws MarcaExceptionPort {
        try {
            MarcaEntityPostgres marcaRegistrada = marcaPostgresRepository.save(marcaMapper.toEntity(marca));
            return marcaMapper.toDomain(marcaRegistrada);
        } catch (Exception e) {
            throw new MarcaExceptionPort(MARCA_ERROR_SAVE + e.getMessage());
        }
    }

    @Override
    public Optional<Marca> marcaFindById(Long id) {
        try {
            return  marcaPostgresRepository.findById(id).map(marcaMapper::toDomain);
        }catch (Exception e){
            throw new MarcaExceptionPort(e.getMessage(), e.getCause());
        }
    }

    @Override
    public Optional<Marca> findByName(String name) {
        return Optional.empty();
    }
}
