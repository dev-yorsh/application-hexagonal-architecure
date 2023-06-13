package com.legall.inspeccion.adapter.output.database.repository.notificacion;

import com.legall.inspeccion.adapter.output.database.entity.notificacion.ProgramacionFechasEntityPostgres;
import com.legall.inspeccion.adapter.output.database.repository.base.BasePostgresRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProgramacionFechaRepository extends BasePostgresRepository<ProgramacionFechasEntityPostgres, Long> {

    Optional<ProgramacionFechasEntityPostgres> findByFechaProgramadaAndEmpleadoIdAndEstaReservado(
            String fechaFinalizacion, Long empleadoId, Boolean estaReservado);


}
