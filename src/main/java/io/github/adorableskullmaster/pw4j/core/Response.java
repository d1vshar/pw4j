package io.github.adorableskullmaster.pw4j.core;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import io.github.adorableskullmaster.pw4j.PoliticsAndWarAPIException;
import io.github.adorableskullmaster.pw4j.domains.Alliances;
import io.github.adorableskullmaster.pw4j.domains.Entity;
import io.github.adorableskullmaster.pw4j.domains.Nations;
import io.github.adorableskullmaster.pw4j.domains.Wars;

import java.lang.reflect.Type;

public class Response<T extends Entity> {

  private String jsonStr;
  private Gson gson = new Gson();
  private T t;
  private String url;

  public Response(String jsonStr, T t, String url) {
    this.jsonStr = jsonStr;
    this.t = t;
    this.url = url;
  }

  public String getJson() {
    return jsonStr;
  }

  public T getEntity() throws JsonSyntaxException {
      JsonElement jsonElement = new JsonParser().parse(jsonStr);
      JsonObject jsonObject = jsonElement.getAsJsonObject();
      if(!t.getClass().getName().equals(Wars.class.getName()) || !t.getClass().getName().equals(Alliances.class.getName()) ||
          !t.getClass().getName().equals(Nations.class.getName())) {
        if (jsonObject.has("error") || jsonObject.has("error_message") ||
            jsonObject.has("general_message") || jsonObject.has("message")) {
          if(jsonObject.has("general_message"))
            throw new PoliticsAndWarAPIException("Unsuccessful API request. Error Received: " + jsonObject.get("general_message").getAsString(), url);
          else if(jsonObject.has("error"))
            throw new PoliticsAndWarAPIException("Unsuccessful API request. Error Received: " + jsonObject.get("error").getAsString(), url);
          else if(jsonObject.has("error_message"))
            throw new PoliticsAndWarAPIException("Unsuccessful API request. Error Received: " + jsonObject.get("error_message").getAsString(), url);
          else if(jsonObject.has("message"))
            throw new PoliticsAndWarAPIException("Unsuccessful API request. Error Received: " + jsonObject.get("message").getAsString(), url);
        }
      }
      Type type = TypeToken.get(t.getClass()).getType();
      return gson.fromJson(jsonStr,type);
  }
}