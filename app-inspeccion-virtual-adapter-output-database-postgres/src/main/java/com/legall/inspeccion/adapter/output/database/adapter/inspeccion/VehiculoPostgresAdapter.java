package com.legall.inspeccion.adapter.output.database.adapter.inspeccion;

import com.legall.inspeccion.adapter.output.database.entity.inspeccion.VehiculoEntityPostgres;
import com.legall.inspeccion.adapter.output.database.mappers.inspeccion.VehiculoMapper;
import com.legall.inspeccion.adapter.output.database.repository.inspeccion.VehiculoPostgresRepository;
import com.legall.inspeccion.application.ports.output.inspeccion.vehiculo.VehiculoFindByPlacaPort;
import com.legall.inspeccion.application.ports.output.inspeccion.vehiculo.VehiculoSavePort;
import com.legall.inspeccion.application.ports.output.inspeccion.vehiculo.exception.VehiculoPortException;
import com.legall.inspeccion.domain.inspeccion.Vehiculo;

import java.util.Optional;

public class VehiculoPostgresAdapter implements VehiculoSavePort, VehiculoFindByPlacaPort {

    private final VehiculoPostgresRepository vehiculoPostgresRepository;
    private final VehiculoMapper vehiculoMapper;

    public VehiculoPostgresAdapter(VehiculoPostgresRepository vehiculoPostgresRepository,
                                   VehiculoMapper vehiculoMapper) {
        this.vehiculoPostgresRepository = vehiculoPostgresRepository;
        this.vehiculoMapper = vehiculoMapper;
    }

    @Override
    public Optional<Vehiculo> findByPlaca(String placa) throws VehiculoPortException {
        try {
            return vehiculoPostgresRepository.findByPlaca(placa).map(vehiculoMapper::toDomain);
        } catch (Exception e) {
            throw new VehiculoPortException(e.getMessage(), e.getCause());
        }
    }

    @Override
    public Vehiculo save(Vehiculo vehiculo) throws VehiculoPortException {
        try {
            VehiculoEntityPostgres vehiculoEntityPostgres = vehiculoMapper.toEntity(vehiculo);
            return vehiculoMapper.toDomain(vehiculoPostgresRepository.save(vehiculoEntityPostgres));
        } catch (Exception e) {
            throw new VehiculoPortException(e.getMessage(), e.getCause());
        }
    }
}
