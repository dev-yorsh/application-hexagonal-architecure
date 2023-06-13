package com.legall.inspeccion.adapter.output.database.repository.administracion;

import com.legall.inspeccion.adapter.output.database.entity.administracion.AseguradoEntityPostgres;
import com.legall.inspeccion.adapter.output.database.repository.base.BasePostgresRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AseguradoPostgresRepository extends BasePostgresRepository<AseguradoEntityPostgres, Long> {

    Optional<AseguradoEntityPostgres> findByNumeroDocumento(String numeroDocumento);
}
