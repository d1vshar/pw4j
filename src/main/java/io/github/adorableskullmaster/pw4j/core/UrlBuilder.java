package io.github.adorableskullmaster.pw4j.core;

import io.github.adorableskullmaster.pw4j.enums.QueryURL;

import java.text.MessageFormat;

public class UrlBuilder {
  public static String build(QueryURL url, String[] args) {
    return MessageFormat.format(url.getUrl(), (Object[]) args);
  }
}
