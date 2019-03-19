package io.github.adorableskullmaster.pw4j.queries;

public abstract class Query {

  String[] args;

  public Query(String... objects) {
    this.args = objects;
  }

  abstract ApiQuery build();
}
