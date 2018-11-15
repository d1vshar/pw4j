package io.github.adorableskullmaster.pw4j.domains;

import com.google.gson.Gson;

public abstract class Entity {

  public String toJson() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
