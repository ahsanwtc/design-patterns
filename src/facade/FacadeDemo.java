package facade;

import facade.exercise.Demo;

public class FacadeDemo {
  public static boolean exercise = true;

  public static void main() {
    if (exercise) {
      Demo.show();
      System.out.println("--------------");
      Demo.solution();
      return;
    }

    var service = new NotificationService();
    service.send("Hello", "target");
  }
}
