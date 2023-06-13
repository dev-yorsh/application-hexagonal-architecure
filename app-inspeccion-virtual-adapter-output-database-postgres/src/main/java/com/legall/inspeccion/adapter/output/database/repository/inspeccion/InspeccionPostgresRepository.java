package com.legall.inspeccion.adapter.output.database.repository.inspeccion;

import com.legall.inspeccion.adapter.output.database.entity.inspeccion.InspeccionEntityPostgres;
import com.legall.inspeccion.adapter.output.database.repository.base.BasePostgresRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InspeccionPostgresRepository extends BasePostgresRepository<InspeccionEntityPostgres, Long> {
}
