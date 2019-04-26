package io.github.adorableskullmaster.pw4j.scrape.clients.models;

import io.github.adorableskullmaster.pw4j.core.Utility;
import io.github.adorableskullmaster.pw4j.scrape.clients.enums.EntityType;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.time.temporal.TemporalAccessor;

public class AllianceBankTransaction {
  private TemporalAccessor date;
  private String note;
  private boolean isBeigeTransaction = false;
  private String sender = "";
  private int senderId = 0;
  private EntityType senderType = EntityType.UNKNOWN;
  private String receiver = "";
  private int receiverId = 0;
  private EntityType receiverType = EntityType.UNKNOWN;
  private String banker = "";
  private int bankerId = 0;
  private double money;
  private double food;
  private double coal;
  private double oil;
  private double uranium;
  private double lead;
  private double iron;
  private double bauxite;
  private double gasoline;
  private double munitions;
  private double steel;
  private double aluminum;

  public AllianceBankTransaction() {

  }

  public AllianceBankTransaction(Elements columns) {
    Element dateElement = columns.get(1);
    date = Utility.parseTime(dateElement.text());

    Element noteElement = dateElement.selectFirst("img");
    if (noteElement != null) {
      note = noteElement.attr("title");
      if (note.contains("captured"))
        isBeigeTransaction = true;
    }

    Element senderElement = columns.get(2).selectFirst("a");
    Element receiverElement = columns.get(3).selectFirst("a");
    Element bankerElement = columns.get(4).selectFirst("a");

    if (senderElement != null) {
      sender = senderElement.text();
      String href = senderElement.attr("href");

      String id = href.substring(href.lastIndexOf("=") + 1);
      senderId = id.isEmpty() ? 0 : Integer.parseInt(id);

      if (href.contains("nation"))
        senderType = EntityType.NATION;
      else if (href.contains("nation") && receiverId == 0)
        senderType = EntityType.DELETED_NATION;
      else if (href.contains("alliance"))
        senderType = EntityType.ALLIANCE;
      else if (href.contains("alliance") && receiverId == 0)
        senderType = EntityType.DEFUNCT_ALLIANCE;
    }
    if (receiverElement != null) {
      receiver = receiverElement.text();
      String href = receiverElement.attr("href");

      String id = href.substring(href.lastIndexOf("=") + 1);
      receiverId = id.isEmpty() ? 0 : Integer.parseInt(id);

      if (href.contains("nation"))
        receiverType = EntityType.NATION;
      else if (href.contains("nation") && receiverId == 0)
        receiverType = EntityType.DELETED_NATION;
      else if (href.contains("alliance"))
        receiverType = EntityType.ALLIANCE;
      else if (href.contains("alliance") && receiverId == 0)
        receiverType = EntityType.DEFUNCT_ALLIANCE;
    }
    if (bankerElement != null) {
      String href = bankerElement.attr("href");

      String id = href.substring(href.lastIndexOf("=") + 1);
      bankerId = id.isEmpty() ? 0 : Integer.parseInt(id);
    }

    money = Double.parseDouble(columns.get(5).text().replaceAll("[$,]", ""));
    food = Double.parseDouble(columns.get(6).text().replaceAll("[$,]", ""));
    coal = Double.parseDouble(columns.get(7).text().replaceAll("[$,]", ""));
    oil = Double.parseDouble(columns.get(8).text().replaceAll("[$,]", ""));
    uranium = Double.parseDouble(columns.get(9).text().replaceAll("[$,]", ""));
    lead = Double.parseDouble(columns.get(10).text().replaceAll("[$,]", ""));
    iron = Double.parseDouble(columns.get(11).text().replaceAll("[$,]", ""));
    bauxite = Double.parseDouble(columns.get(12).text().replaceAll("[$,]", ""));
    gasoline = Double.parseDouble(columns.get(13).text().replaceAll("[$,]", ""));
    munitions = Double.parseDouble(columns.get(14).text().replaceAll("[$,]", ""));
    steel = Double.parseDouble(columns.get(15).text().replaceAll("[$,]", ""));
    aluminum = Double.parseDouble(columns.get(16).text().replaceAll("[$,]", ""));
  }

  public TemporalAccessor getDate() {
    return date;
  }

  public void setDate(TemporalAccessor date) {
    this.date = date;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public int getSenderId() {
    return senderId;
  }

  public void setSenderId(int senderId) {
    this.senderId = senderId;
  }

  public EntityType getSenderType() {
    return senderType;
  }

  public void setSenderType(EntityType senderType) {
    this.senderType = senderType;
  }

  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

  public int getReceiverId() {
    return receiverId;
  }

  public void setReceiverId(int receiverId) {
    this.receiverId = receiverId;
  }

  public EntityType getReceiverType() {
    return receiverType;
  }

  public void setReceiverType(EntityType receiverType) {
    this.receiverType = receiverType;
  }

  public String getBanker() {
    return banker;
  }

  public void setBanker(String banker) {
    this.banker = banker;
  }

  public int getBankerId() {
    return bankerId;
  }

  public void setBankerId(int bankerId) {
    this.bankerId = bankerId;
  }

  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }

  public double getFood() {
    return food;
  }

  public void setFood(double food) {
    this.food = food;
  }

  public double getCoal() {
    return coal;
  }

  public void setCoal(double coal) {
    this.coal = coal;
  }

  public double getOil() {
    return oil;
  }

  public void setOil(double oil) {
    this.oil = oil;
  }

  public double getUranium() {
    return uranium;
  }

  public void setUranium(double uranium) {
    this.uranium = uranium;
  }

  public double getLead() {
    return lead;
  }

  public void setLead(double lead) {
    this.lead = lead;
  }

  public double getIron() {
    return iron;
  }

  public void setIron(double iron) {
    this.iron = iron;
  }

  public double getBauxite() {
    return bauxite;
  }

  public void setBauxite(double bauxite) {
    this.bauxite = bauxite;
  }

  public double getGasoline() {
    return gasoline;
  }

  public void setGasoline(double gasoline) {
    this.gasoline = gasoline;
  }

  public double getMunitions() {
    return munitions;
  }

  public void setMunitions(double munitions) {
    this.munitions = munitions;
  }

  public double getSteel() {
    return steel;
  }

  public void setSteel(double steel) {
    this.steel = steel;
  }

  public double getAluminum() {
    return aluminum;
  }

  public void setAluminum(double aluminum) {
    this.aluminum = aluminum;
  }

  public boolean isBeigeTransaction() {
    return isBeigeTransaction;
  }

  public void setBeigeTransaction(boolean beigeTransaction) {
    isBeigeTransaction = beigeTransaction;
  }

  @Override
  public String toString() {
    return "ScrapedTransaction{" +
        "date=" + date +
        ", note='" + note + '\'' +
        ", isBeigeTransaction=" + isBeigeTransaction +
        ", sender='" + sender + '\'' +
        ", senderId=" + senderId +
        ", senderType=" + senderType +
        ", receiver='" + receiver + '\'' +
        ", receiverId=" + receiverId +
        ", receiverType=" + receiverType +
        ", banker='" + banker + '\'' +
        ", bankerId=" + bankerId +
        ", money=" + money +
        ", food=" + food +
        ", coal=" + coal +
        ", oil=" + oil +
        ", uranium=" + uranium +
        ", lead=" + lead +
        ", iron=" + iron +
        ", bauxite=" + bauxite +
        ", gasoline=" + gasoline +
        ", munitions=" + munitions +
        ", steel=" + steel +
        ", aluminum=" + aluminum +
        '}';
  }
}
