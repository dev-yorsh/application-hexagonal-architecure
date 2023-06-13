package com.legall.inspeccion.application.service.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.util.Objects.isNull;

public final class GenericUtil {

    public static final String FORMATO_FECHA = "dd/MM/yyyy HH:mm";

    public static String formatCurrentDate(String formato) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formato);
        return LocalDateTime.now().format(dateTimeFormatter);
    }

    public static LocalDateTime parseDateTime(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(FORMATO_FECHA);
        return LocalDateTime.parse(date, dateTimeFormatter);
    }


    public static String formatDateDefault(LocalDateTime date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(FORMATO_FECHA);
        return (!isNull(date)) ? date.format(dateTimeFormatter) : "Fecha no asignada";
    }

}
