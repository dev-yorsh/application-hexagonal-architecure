package com.legall.inspeccion.adapter.output.database.repository.administracion;

import com.legall.inspeccion.adapter.output.database.entity.administracion.ContratanteEntityPostgres;
import com.legall.inspeccion.adapter.output.database.repository.base.BasePostgresRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContratantePostgresRepository extends BasePostgresRepository<ContratanteEntityPostgres, Long> {

    @Modifying
    @Query("update ContratanteEntityPostgres c set c.razonSocial = :razonSocial where c.contratanteId = :id")
    void updateRazonSocial(@Param(value = "id") long id, @Param(value = "razonSocial") String razonSocial);

    Optional<ContratanteEntityPostgres> findByNumeroDocumento(String numeroDocumento);

}
