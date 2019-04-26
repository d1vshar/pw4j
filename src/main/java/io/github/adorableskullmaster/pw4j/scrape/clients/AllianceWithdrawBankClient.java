package io.github.adorableskullmaster.pw4j.scrape.clients;

import io.github.adorableskullmaster.pw4j.enums.ResourceType;
import io.github.adorableskullmaster.pw4j.scrape.PoliticsAndWarClient;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllianceWithdrawBankClient extends PoliticsAndWarClient {

  private final int aid;
  private final String recipient;
  private final String token;
  private boolean alliance;
  private String note;
  private HashMap<ResourceType, Double> resources = new HashMap<>();

  public AllianceWithdrawBankClient(int aid, String email, String password, boolean rememberMe, String recipient) throws IOException {
    super(email, password, rememberMe);
    for (ResourceType resourceType : ResourceType.values()) {
      resources.put(resourceType, 0.00);
    }
    this.alliance = false;
    this.recipient = recipient;
    this.note = "";
    this.aid = aid;
    this.token = getToken(aid);
  }

  public void execute() throws IOException {
    List<NameValuePair> params = new ArrayList<>();
    for (Map.Entry<ResourceType, Double> entry : resources.entrySet()) {
      params.add(new BasicNameValuePair(entry.getKey().getBankString(), Double.toString(entry.getValue())));
    }
    params.add(new BasicNameValuePair("withrecipient", recipient));
    params.add(new BasicNameValuePair("withnote", note));
    params.add(new BasicNameValuePair("withsubmit", "Withdraw"));
    params.add(new BasicNameValuePair("token", token));
    if (alliance)
      params.add(new BasicNameValuePair("withtype", "Alliance"));
    else
      params.add(new BasicNameValuePair("withtype", "Nation"));

    post("https://politicsandwar.com/alliance/id=" + aid + "&display=bank", params, true);
  }

  public void setAlliance(boolean alliance) {
    this.alliance = alliance;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public void setResources(HashMap<ResourceType, Double> resources) {
    this.resources = resources;
  }

  public void setResource(ResourceType resourceType, Double value) {
    resources.put(resourceType, value);
  }

}
