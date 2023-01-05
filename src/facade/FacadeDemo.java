package facade;

public class FacadeDemo {
  public static boolean exercise = false;

  public static void main() {
    if (exercise) {
      return;
    }

    var service = new NotificationService();
    service.send("Hello", "target");
  }
}
