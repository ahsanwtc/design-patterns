package observer;

import observer.exercise.StatusBar;
import observer.exercise.Stock;
import observer.exercise.StockListView;

public class ObserverDemo {
  public static boolean exercise = true;
  public static void main() {

    if (ObserverDemo.exercise) {
      var statusBar = new StatusBar();
      var stockList = new StockListView();

      var amz = new Stock("AMZ", 191.2f);
      var apl = new Stock("APL", 11.2f);
      var tsl = new Stock("TST", 121.2f);
      var twt = new Stock("TWT", 4.2f);
      var ntf = new Stock("NTF", 1.2f);

      statusBar.addStock(tsl);
      statusBar.addStock(twt);

      stockList.addStock(amz);
      stockList.addStock(apl);
      stockList.addStock(tsl);
      stockList.addStock(twt);
      stockList.addStock(ntf);

      System.out.println("updating tsl price to 41.2");
      tsl.setPrice(41.2f);


      System.out.println("updating ntf price to .2");
      ntf.setPrice(.2f);


      return;
    }

    var dataSource = new DataSource();
    var sheet = new SpreadSheet(dataSource);
    var chart1 = new Chart(dataSource);
    var chart2 = new Chart(dataSource);
    dataSource.addObserver(sheet);
    dataSource.addObserver(chart1);
    dataSource.addObserver(chart2);

    dataSource.setValue(2);

  }
}
