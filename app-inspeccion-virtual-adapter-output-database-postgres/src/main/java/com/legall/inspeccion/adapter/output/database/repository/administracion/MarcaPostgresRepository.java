package com.legall.inspeccion.adapter.output.database.repository.administracion;

import com.legall.inspeccion.adapter.output.database.entity.administracion.MarcaEntityPostgres;
import com.legall.inspeccion.adapter.output.database.repository.base.BasePostgresRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MarcaPostgresRepository extends BasePostgresRepository<MarcaEntityPostgres, Long> {

    Optional<MarcaEntityPostgres> findByNombre(String nombre);
}
