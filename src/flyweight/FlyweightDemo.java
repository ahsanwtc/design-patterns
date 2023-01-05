package flyweight;

import flyweight.exercies.Demo;

public class FlyweightDemo {
  public static boolean exercise = true;

  public static void main() {
    if (exercise) {
      Demo.show();
      System.out.println("----------------------------------------------------------------------");
      Demo.solution();
      return;
    }

    var service = new PointService(new PointIconFactory());
    for (var point: service.getPoints()) {
      point.draw();
    }
  }
}
