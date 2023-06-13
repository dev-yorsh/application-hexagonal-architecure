package com.legall.inspeccion.config;

import com.legall.inspeccion.adapter.input.rest.controller.administracion.MarcaControllerImpl;
import com.legall.inspeccion.adapter.input.rest.controller.inspeccion.InspeccionController;
import com.legall.inspeccion.adapter.input.rest.controller.inspeccion.TramiteControllerImpl;
import com.legall.inspeccion.adapter.input.rest.dto.mapper.inspeccion.TramiteRequestMapper;
import com.legall.inspeccion.adapter.output.database.adapter.administracion.AseguradoPostgresAdapter;
import com.legall.inspeccion.adapter.output.database.adapter.administracion.ContratantePostgresAdapter;
import com.legall.inspeccion.adapter.output.database.adapter.administracion.MarcaPostgresAdapter;
import com.legall.inspeccion.adapter.output.database.adapter.informe.InformePostgresAdapter;
import com.legall.inspeccion.adapter.output.database.adapter.inspeccion.InspeccionPostgresAdapter;
import com.legall.inspeccion.adapter.output.database.adapter.inspeccion.TramitePostgresAdapter;
import com.legall.inspeccion.adapter.output.database.adapter.inspeccion.VehiculoPostgresAdapter;
import com.legall.inspeccion.adapter.output.database.adapter.notificacion.ProgramacionFechaPostgresAdapter;
import com.legall.inspeccion.adapter.output.database.mappers.administracion.AseguradoMapper;
import com.legall.inspeccion.adapter.output.database.mappers.administracion.ContratanteMapper;
import com.legall.inspeccion.adapter.output.database.mappers.administracion.MarcaMapper;
import com.legall.inspeccion.adapter.output.database.mappers.informe.InformeMapper;
import com.legall.inspeccion.adapter.output.database.mappers.inspeccion.InspeccionMapper;
import com.legall.inspeccion.adapter.output.database.mappers.inspeccion.TramiteMapper;
import com.legall.inspeccion.adapter.output.database.mappers.inspeccion.VehiculoMapper;
import com.legall.inspeccion.adapter.output.database.mappers.notificacion.ProgramacionFechaMapper;
import com.legall.inspeccion.adapter.output.database.repository.administracion.AseguradoPostgresRepository;
import com.legall.inspeccion.adapter.output.database.repository.administracion.ContratantePostgresRepository;
import com.legall.inspeccion.adapter.output.database.repository.administracion.MarcaPostgresRepository;
import com.legall.inspeccion.adapter.output.database.repository.informe.InformePostgresRepository;
import com.legall.inspeccion.adapter.output.database.repository.inspeccion.InspeccionPostgresRepository;
import com.legall.inspeccion.adapter.output.database.repository.inspeccion.TramitePostgresRepository;
import com.legall.inspeccion.adapter.output.database.repository.inspeccion.VehiculoPostgresRepository;
import com.legall.inspeccion.adapter.output.database.repository.notificacion.ProgramacionFechaRepository;
import com.legall.inspeccion.application.ports.input.notificacion.pregramacionfecha.ProgramacionFechaReservarUseCase;
import com.legall.inspeccion.application.ports.output.administracion.asegurado.AseguradoFindByDocumentPort;
import com.legall.inspeccion.application.ports.output.administracion.asegurado.AseguradoSavePort;
import com.legall.inspeccion.application.ports.output.administracion.contratante.ContratanteFindByDocumentPort;
import com.legall.inspeccion.application.ports.output.administracion.contratante.ContratanteSavePort;
import com.legall.inspeccion.application.ports.output.administracion.contratante.ContratanteUpdateRazonSocialPort;
import com.legall.inspeccion.application.ports.output.administracion.marca.MarcaFindAllPort;
import com.legall.inspeccion.application.ports.output.administracion.marca.MarcaFindByIdPort;
import com.legall.inspeccion.application.ports.output.administracion.marca.MarcaFindByNamePort;
import com.legall.inspeccion.application.ports.output.administracion.marca.MarcaSavePort;
import com.legall.inspeccion.application.ports.output.informe.informe.InformeSavePort;
import com.legall.inspeccion.application.ports.output.inspeccion.inspeccion.InspeccionSavePort;
import com.legall.inspeccion.application.ports.output.inspeccion.tramite.TramiteFindAllPort;
import com.legall.inspeccion.application.ports.output.inspeccion.tramite.TramiteFindByIdPort;
import com.legall.inspeccion.application.ports.output.inspeccion.tramite.TramiteSavePort;
import com.legall.inspeccion.application.ports.output.inspeccion.vehiculo.VehiculoFindByPlacaPort;
import com.legall.inspeccion.application.ports.output.inspeccion.vehiculo.VehiculoSavePort;
import com.legall.inspeccion.application.ports.output.notificacion.programacionfechas.ProgramacionFechaFindAllAvailablePort;
import com.legall.inspeccion.application.ports.output.notificacion.programacionfechas.ProgramacionFechasSavePort;
import com.legall.inspeccion.application.service.administracion.marca.MarcaService;
import com.legall.inspeccion.application.service.inspeccion.inspeccion.InspeccionService;
import com.legall.inspeccion.application.service.inspeccion.tramite.TramiteService;
import com.legall.inspeccion.application.service.notificacion.ProgramacionFechasService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalConfig {

    @Bean
    public MarcaControllerImpl marcaControllerImpl(MarcaService marcaService) {
        return new MarcaControllerImpl(marcaService);
    }

    @Bean
    public MarcaService marcaService(MarcaFindByNamePort marcaFindByNamePort, MarcaSavePort marcaSavePort,
                                     MarcaFindAllPort marcaFindAllPort, MarcaFindByIdPort marcaFindByIdPort) {
        return new MarcaService(marcaFindByNamePort, marcaSavePort, marcaFindAllPort, marcaFindByIdPort);
    }

    @Bean
    public MarcaPostgresAdapter marcaPostgresAdapter(MarcaPostgresRepository marcaPostgresRepository,
                                                     MarcaMapper marcaMapper) {
        return new MarcaPostgresAdapter(marcaPostgresRepository, marcaMapper);
    }


    @Bean
    public AseguradoPostgresAdapter aseguradoPostgresAdapter(AseguradoPostgresRepository aseguradoPostgresRepository,
                                                             AseguradoMapper aseguradoMapper) {
        return new AseguradoPostgresAdapter(aseguradoPostgresRepository, aseguradoMapper);
    }

    @Bean
    public ContratantePostgresAdapter contratantePostgresAdapter(ContratantePostgresRepository contratantePostgresRepository,
                                                                 ContratanteMapper contratanteMapper) {
        return new ContratantePostgresAdapter(contratantePostgresRepository, contratanteMapper);
    }


    // ADAPTER IN
    @Bean
    public TramiteControllerImpl tramiteControllerImpl(TramiteService tramiteService,
                                                       TramiteRequestMapper tramiteRequestMapper) {
        return new TramiteControllerImpl(tramiteService, tramiteRequestMapper);
    }

    // SERVICE
    @Bean
    public TramiteService tramiteService(TramiteFindAllPort tramiteFindAllPort,
                                         TramiteFindByIdPort tramiteFindByIdPort,
                                         TramiteSavePort tramiteSavePort,
                                         ContratanteFindByDocumentPort contratanteFindByDocumentPort,
                                         ContratanteSavePort contratanteSavePort,
                                         ContratanteUpdateRazonSocialPort contratanteUpdateRazonSocialPort,
                                         AseguradoFindByDocumentPort aseguradoFindByDocumentPort,
                                         AseguradoSavePort aseguradoSavePort) {
        return new TramiteService(tramiteFindAllPort, tramiteFindByIdPort, tramiteSavePort,
                contratanteFindByDocumentPort, contratanteSavePort, contratanteUpdateRazonSocialPort,
                aseguradoFindByDocumentPort, aseguradoSavePort);
    }

    // ADAPTER OUT
    @Bean
    public TramitePostgresAdapter tramitePostgresAdapter(TramitePostgresRepository tramitePostgresRepository,
                                                         TramiteMapper tramiteMapper) {
        return new TramitePostgresAdapter(tramitePostgresRepository, tramiteMapper);
    }

    // ADAPTER :: VEHICULO
    @Bean
    public VehiculoPostgresAdapter tramiteRequestMapper(VehiculoPostgresRepository vehiculoPostgresRepository,
                                                        VehiculoMapper vehiculoMapper) {
        return new VehiculoPostgresAdapter(vehiculoPostgresRepository, vehiculoMapper);
    }


    // ADAPTER :: INFORME
    @Bean
    public InformePostgresAdapter informePostgresAdapter(InformePostgresRepository informePostgresRepository, InformeMapper informeMapper) {
        return new InformePostgresAdapter(informePostgresRepository, informeMapper);
    }


    // PROGRAMACION FECHA
    @Bean
    public ProgramacionFechaPostgresAdapter programacionFechaPostgresAdapter(
            ProgramacionFechaRepository programacionFechaRepository,
            ProgramacionFechaMapper programacionFechaMapper) {
        return new ProgramacionFechaPostgresAdapter(programacionFechaRepository, programacionFechaMapper);
    }

    @Bean
    public ProgramacionFechasService programacionFechasService(
            ProgramacionFechasSavePort programacionFechasSavePort,
            ProgramacionFechaFindAllAvailablePort programacionFechaFindAllAvailablePort) {
        return new ProgramacionFechasService(programacionFechasSavePort,
                programacionFechaFindAllAvailablePort);
    }


    //Inspeccion
    @Bean
    public InspeccionPostgresAdapter inspeccionPostgresAdapter(InspeccionPostgresRepository inspeccionPostgresRepository,
                                                               InspeccionMapper inspeccionMapper) {
        return new InspeccionPostgresAdapter(inspeccionPostgresRepository, inspeccionMapper);
    }

    @Bean
    public InspeccionService inspeccionService(InspeccionSavePort inspeccionSavePort,
                                               TramiteFindByIdPort tramiteFindByIdPort,
                                               VehiculoFindByPlacaPort vehiculoFindByPlacaPort,
                                               VehiculoSavePort vehiculoSavePort,
                                               MarcaFindByIdPort marcaFindByIdPort,
                                               InformeSavePort informeSavePort,
                                               ProgramacionFechaReservarUseCase programacionFechaReservarUseCase) {
        return new InspeccionService(inspeccionSavePort, tramiteFindByIdPort, vehiculoFindByPlacaPort,
                vehiculoSavePort, marcaFindByIdPort, informeSavePort, programacionFechaReservarUseCase);
    }

    @Bean
    public InspeccionController inspeccionController(InspeccionService inspeccionService) {
        return new InspeccionController(inspeccionService);
    }

}
