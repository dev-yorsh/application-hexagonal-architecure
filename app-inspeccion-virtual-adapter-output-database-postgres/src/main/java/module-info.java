module adapter.output.database.postgres {
    // Importamos los puertos de la aplicación
    requires transitive application;

    // Importamos las librerias de los frameworks
    requires lombok;
    requires jakarta.persistence;
    requires spring.data.jpa;
    requires spring.data.commons;
    requires spring.context;
    requires org.hibernate.orm.core;
    requires spring.tx;

    exports com.legall.inspeccion.adapter.output.database.adapter.administracion;
    exports com.legall.inspeccion.adapter.output.database.mappers.administracion;
    exports com.legall.inspeccion.adapter.output.database.mappers.administracion.impl;
    exports com.legall.inspeccion.adapter.output.database.repository.administracion;


    exports com.legall.inspeccion.adapter.output.database.adapter.inspeccion;
    exports com.legall.inspeccion.adapter.output.database.mappers.inspeccion;
    exports com.legall.inspeccion.adapter.output.database.mappers.inspeccion.impl;
    exports com.legall.inspeccion.adapter.output.database.repository.inspeccion;
    exports com.legall.inspeccion.adapter.output.database.entity.inspeccion;
    exports com.legall.inspeccion.adapter.output.database.repository.informe;

}