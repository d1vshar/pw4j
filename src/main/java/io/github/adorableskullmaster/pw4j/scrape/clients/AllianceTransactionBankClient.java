package io.github.adorableskullmaster.pw4j.scrape.clients;

import io.github.adorableskullmaster.pw4j.scrape.PoliticsAndWarClient;
import io.github.adorableskullmaster.pw4j.scrape.PoliticsAndWarClientException;
import io.github.adorableskullmaster.pw4j.scrape.clients.models.ScrapedTransaction;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AllianceTransactionBankClient extends PoliticsAndWarClient {
  private List<ScrapedTransaction> scrapedTransactions;
  private int aid;

  public AllianceTransactionBankClient(int aid, String email, String password, boolean rememberMe) {
    super(email, password, rememberMe);
    this.aid = aid;
    scrapedTransactions = new ArrayList<>();
  }

  public List<ScrapedTransaction> execute() throws IOException {
    String html = get("https://politicsandwar.com/alliance/id=" + aid + "&display=bank", new ArrayList<>(), true);
    Document document = Jsoup.parse(html);

    Element table = document.selectFirst("div#rightcolumn > div#scrollme > .nationtable");
    if (table == null)
      throw new PoliticsAndWarClientException("No access to bank page.");

    Elements rows = table.select("tr");
    for (int i = 1; i < rows.size(); i++) {
      Element row = rows.get(i);
      Elements columns = row.select("td");
      ScrapedTransaction scrapedTransaction = new ScrapedTransaction(columns);
      scrapedTransactions.add(scrapedTransaction);
    }
    return scrapedTransactions;
  }
}
