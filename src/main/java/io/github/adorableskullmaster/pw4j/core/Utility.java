package io.github.adorableskullmaster.pw4j.core;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAccessor;

public class Utility {
  public static TemporalAccessor parseTime(String dateString) {
    DateTimeFormatter dtm = new DateTimeFormatterBuilder()
        .append(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a"))
        .toFormatter()
        .withZone(ZoneId.of("UTC"));
    return dtm.parse(dateString.trim().toUpperCase());
  }
}
