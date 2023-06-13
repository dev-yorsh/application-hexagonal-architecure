package com.legall.inspeccion.adapter.output.database.repository.informe;

import com.legall.inspeccion.adapter.output.database.entity.informe.InformeEntityPostgres;
import com.legall.inspeccion.adapter.output.database.repository.base.BasePostgresRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformePostgresRepository extends BasePostgresRepository<InformeEntityPostgres, Long> {
}
