module adapter.input.http.rest {
    requires transitive application;

    requires spring.web;
    requires lombok;
    requires com.fasterxml.jackson.annotation;
    requires spring.context;

    exports com.legall.inspeccion.adapter.input.rest.controller.administracion;
    exports com.legall.inspeccion.adapter.input.rest.controller.inspeccion;
}