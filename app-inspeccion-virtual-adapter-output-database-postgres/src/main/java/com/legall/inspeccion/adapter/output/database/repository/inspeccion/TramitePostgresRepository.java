package com.legall.inspeccion.adapter.output.database.repository.inspeccion;

import com.legall.inspeccion.adapter.output.database.entity.inspeccion.TramiteEntityPostgres;
import com.legall.inspeccion.adapter.output.database.repository.base.BasePostgresRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TramitePostgresRepository extends BasePostgresRepository<TramiteEntityPostgres, Long> {
}
