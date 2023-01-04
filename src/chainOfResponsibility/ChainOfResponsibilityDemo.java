package chainOfResponsibility;

public class ChainOfResponsibilityDemo {
  public static boolean exercise = false;

  public static void main() {
    if (ChainOfResponsibilityDemo.exercise) {
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
