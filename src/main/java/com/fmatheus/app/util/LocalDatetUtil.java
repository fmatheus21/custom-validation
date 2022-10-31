package com.fmatheus.app.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDatetUtil {

    private static final String DATETIME_MINUTE_SECONDS = "dd/MM/yyyy HH:mm:ss";

    private static final String DATETIME_MINUTE = "dd/MM/yyyy HH:mm";

    private static final String DATE_PT = "dd/MM/yyyy";

    private LocalDatetUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static String converterToString(LocalDate localDate, FormatStyle formatStyle) {
        return localDate.format(DateTimeFormatter.ofLocalizedDate(formatStyle));
    }

    public static String converterToLocalDate(LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PT);
        return formatter.format(localDate);
    }

    public static String converterLocalDateTimeToString(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATETIME_MINUTE_SECONDS);
        return formatter.format(localDateTime);
    }

    public static LocalDate converterStringToLocalDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PT);
        return LocalDate.parse(date, formatter);
    }

    public static LocalDateTime converterStringToLocalDateTime(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATETIME_MINUTE);
        return LocalDateTime.parse(date, formatter);
    }

    public static Long returnsMillisecondsOfDateTime() {
        return LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public static LocalDate currentDate() {
        return LocalDate.now();
    }

    public static LocalDateTime currentDateTime() {
        return LocalDateTime.now();
    }

    public static int currentYear() {
        return LocalDate.now().getYear();
    }

}
