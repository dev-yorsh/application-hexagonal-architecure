package com.legall.inspeccion.adapter.output.database.adapter.notificacion;

import com.legall.inspeccion.adapter.output.database.entity.inspeccion.TramiteEntityPostgres;
import com.legall.inspeccion.adapter.output.database.entity.notificacion.ProgramacionFechasEntityPostgres;
import com.legall.inspeccion.adapter.output.database.mappers.notificacion.ProgramacionFechaMapper;
import com.legall.inspeccion.adapter.output.database.repository.notificacion.ProgramacionFechaRepository;
import com.legall.inspeccion.application.ports.output.notificacion.programacionfechas.ProgramacionFechaFindAllAvailablePort;
import com.legall.inspeccion.application.ports.output.notificacion.programacionfechas.ProgramacionFechasFindByAvailablePort;
import com.legall.inspeccion.application.ports.output.notificacion.programacionfechas.ProgramacionFechasSavePort;
import com.legall.inspeccion.application.ports.output.notificacion.programacionfechas.exception.ProgramacionFechasExceptionPort;
import com.legall.inspeccion.domain.notificacion.ProgramacionFechas;

import java.util.List;
import java.util.Optional;

public class ProgramacionFechaPostgresAdapter implements ProgramacionFechasSavePort,
        ProgramacionFechasFindByAvailablePort, ProgramacionFechaFindAllAvailablePort {

    public ProgramacionFechaRepository programacionFechaRepository;
    public ProgramacionFechaMapper programacionFechaMapper;


    public ProgramacionFechaPostgresAdapter(ProgramacionFechaRepository programacionFechaRepository,
                                            ProgramacionFechaMapper programacionFechaMapper) {
        this.programacionFechaRepository = programacionFechaRepository;
        this.programacionFechaMapper = programacionFechaMapper;
    }

    @Override
    public Optional<ProgramacionFechas> findByAvailable(String fechaFinalizacion,
                                                        Long empleadoId,
                                                        Boolean estaReservado) throws ProgramacionFechasExceptionPort {
        try {
            return programacionFechaRepository.findByFechaProgramadaAndEmpleadoIdAndEstaReservado(
                            fechaFinalizacion, empleadoId, estaReservado)
                    .map(programacionFechaMapper::toDomain);

        } catch (Exception e) {
            throw new ProgramacionFechasExceptionPort(e.getMessage(), e.getCause());
        }
    }

    @Override
    public ProgramacionFechas save(ProgramacionFechas programacionFechas) throws ProgramacionFechasExceptionPort {
        try {
            return programacionFechaMapper.toDomain(programacionFechaRepository.save(
                    programacionFechaMapper.toEntity(programacionFechas)));
        }catch (Exception e){
            throw new ProgramacionFechasExceptionPort(e.getMessage(), e.getCause());
        }
    }

    @Override
    public List<ProgramacionFechas> findAllAvailable() {
        try {
            List<ProgramacionFechasEntityPostgres> programacionFechasEntity = programacionFechaRepository.findAll();
            return programacionFechaMapper.toListDomain(programacionFechasEntity);
        }catch (Exception e){
            throw new ProgramacionFechasExceptionPort(e.getMessage(), e.getCause());
        }
    }
}
