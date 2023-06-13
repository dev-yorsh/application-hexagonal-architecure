package com.legall.inspeccion.application.service.constants;

public class MensajeConstanteApplication {


    public static class MarcaMessageConstant {
        public static final String MARCA_NOMBRE_INVALIDO = "Debe ingresar el nombre de la marca";
        public static final String MARCA_NO_ENCONTRADA = "La marca no se encuentra registrada";
    }

    public static class TramiteMessageConstant {
        public static final String TRAMITE_NO_ENCONTRADO = "El tramite no existe";
        public static final String ERROR_GUARDAR_TRAMITE = "Error al guardar el trámite";

    }

    public static class InformeMessageConstant {
        public static final String NUEVO_INFORME = "Informe programado por el Area de Legall";
        public static final String PREFIJO_INFORME = "INF";
    }

    public static class ProgramacionFechaMessageConstant {

        public static final String PROGRAMACION_FECHA_INCORRECTA = "La fecha ingresada debe ser mayor a la actual";
        public static final String PROGRAMACION_FECHA_OCUPADA = "La fecha ingresada ya se encuentra ocupada, " +
                "por favor seleccione otra fecha";

    }


}
