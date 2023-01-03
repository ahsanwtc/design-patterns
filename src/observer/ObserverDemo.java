package observer;

public class ObserverDemo {
  public static boolean exercise = false;
  public static void main() {

    if (ObserverDemo.exercise) {

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
