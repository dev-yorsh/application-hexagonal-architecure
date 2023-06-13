module application {
    requires transitive domain;

    // EXPORTAMOS :: PUERTOS DE ENTRADA
    exports com.legall.inspeccion.application.ports.input.administracion.marca;
    exports com.legall.inspeccion.application.ports.input.administracion.asegurado;
    exports com.legall.inspeccion.application.ports.input.administracion.contratante;
    exports com.legall.inspeccion.application.ports.input.inspeccion.tramite;

    // EXPORTAMOS :: PUERTOS DE SALIDA
    exports com.legall.inspeccion.application.ports.output.administracion.marca;
    exports com.legall.inspeccion.application.ports.output.administracion.marca.exception;
    exports com.legall.inspeccion.application.ports.output.administracion.asegurado;
    exports com.legall.inspeccion.application.ports.output.administracion.asegurado.exception;
    exports com.legall.inspeccion.application.ports.output.administracion.contratante;
    exports com.legall.inspeccion.application.ports.output.administracion.contratante.exception;
    exports com.legall.inspeccion.application.ports.output.inspeccion.tramite;
    exports com.legall.inspeccion.application.ports.output.inspeccion.tramite.exception;
    exports com.legall.inspeccion.application.ports.output.inspeccion.inspeccion;
    exports com.legall.inspeccion.application.ports.output.inspeccion.inspeccion.exception;
    exports com.legall.inspeccion.application.ports.output.inspeccion.vehiculo;
    exports com.legall.inspeccion.application.ports.output.inspeccion.vehiculo.exception;
    exports com.legall.inspeccion.application.ports.output.informe.informe;
    exports com.legall.inspeccion.application.ports.output.informe.exception;
    exports com.legall.inspeccion.application.ports.output.notificacion.programacionfechas;
    exports com.legall.inspeccion.application.ports.output.notificacion.programacionfechas.exception;

    // EXPORTAMOS :: SERVICIOS
    exports com.legall.inspeccion.application.service.administracion.asegurado;
    exports com.legall.inspeccion.application.service.administracion.contratante;
    exports com.legall.inspeccion.application.service.administracion.marca;
    exports com.legall.inspeccion.application.service.inspeccion.tramite;
    exports com.legall.inspeccion.application.service.inspeccion.inspeccion;
    exports com.legall.inspeccion.application.service.informe.informe;

    //Exportacion del los commands
    exports com.legall.inspeccion.application.ports.command;

}