package io.github.adorableskullmaster.pw4j.enums;

public enum ResourceType {
  MONEY("money", "withmoney"),
  FOOD("food", "withfood"),
  COAL("coal", "withcoal"),
  OIL("oil", "withoil"),
  URANIUM("uranium", "withuranium"),
  LEAD("lead", "withlead"),
  IRON("iron", "withiron"),
  BAUXITE("bauxite", "withbauxite"),
  GASONLINE("gasoline", "withgasoline"),
  MUNITIONS("munitions", "withmunitions"),
  STEEL("steel", "withsteel"),
  ALUMINUM("aluminum", "withaluminum");

  private String name;
  private String bankString;

  ResourceType(String name, String bankString) {
    this.name = name;
    this.bankString = bankString;
  }

  public String getName() {
    return name;
  }

  public String getBankString() {
    return bankString;
  }
}
