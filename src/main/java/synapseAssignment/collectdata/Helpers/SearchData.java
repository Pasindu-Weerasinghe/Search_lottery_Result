package synapseAssignment.collectdata.Helpers;

import lombok.Getter;
import lombok.Setter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
@Getter
@Setter
public class SearchData {
    Integer lotteryId;
    String lotteryName;
    String date;
    String result;
    public SearchData() {
        String url = "https://www.nlb.lk/results/govisetha";
        try {
            Document document = Jsoup.connect(url).get();


            //extract lottery name
            Elements headingTags = document.getElementsByTag("h1");
            this.lotteryName = headingTags.get(0).text().split(" ")[0];

            //extracting columns
            Elements trTags = document.select("tr");
            trTags.remove(0);
            Element latest = trTags.get(0);
            Element firstColumn = latest.select("td").get(0);


            //extracting id and date from first column
            String[] firstColumnData = firstColumn.text().split(" ");
            this.lotteryId =Integer.parseInt( firstColumnData[0]);
            this.date = firstColumn.text().split(lotteryId.toString())[1];

            //extracting numbers from 2nd column
            Element secondColumn = latest.select("td").get(1);
            this.result = secondColumn.getElementsByTag("ol").get(0).text();

            //display results
            System.out.println("id: "+lotteryId);
            System.out.println("name: "+lotteryName);
            System.out.println("date: " +date);
            System.out.println("numbers: "+result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
