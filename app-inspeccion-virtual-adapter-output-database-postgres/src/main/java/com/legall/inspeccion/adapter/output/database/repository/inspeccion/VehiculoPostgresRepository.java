package com.legall.inspeccion.adapter.output.database.repository.inspeccion;

import com.legall.inspeccion.adapter.output.database.entity.inspeccion.VehiculoEntityPostgres;
import com.legall.inspeccion.adapter.output.database.repository.base.BasePostgresRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehiculoPostgresRepository extends BasePostgresRepository<VehiculoEntityPostgres, Long> {

    Optional<VehiculoEntityPostgres> findByPlaca(String placa);
}
