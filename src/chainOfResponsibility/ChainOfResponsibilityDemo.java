package chainOfResponsibility;

import chainOfResponsibility.exercise.*;

public class ChainOfResponsibilityDemo {
  public static boolean exercise = true;

  public static void main() {
    if (ChainOfResponsibilityDemo.exercise) {
      var excelReader = new ExcelReader(null);
      var numbersReader = new NumbersReader(excelReader);
      var quickbooksReader = new QuickbooksReader(numbersReader);

      var reader = new DataReaderNew(quickbooksReader);

      System.out.println("file 1");
      reader.read(new File("xls"));

      System.out.println("file s");
      reader.read(new File("qbw"));

      System.out.println("file 3");
      reader.read(new File("numbers"));

      return;
    }

    /* authenticator -> logger -> compressor -> encryptor */
    var encryptor = new Encryptor(null);
    var compressor = new Compressor(encryptor);
    var logger = new Logger(compressor);
    var authenticator = new Authenticator(logger);

    var server = new WebServer(authenticator);

    /* valid  request */
    System.out.println("request 1");
    server.handle(new HttpRequest("admin", "1234"));

    /* invalid  request */
    System.out.println("request 2");
    server.handle(new HttpRequest("ad", "1234"));
  }
}
