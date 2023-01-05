package flyweight;

public class FlyweightDemo {
  public static boolean exercise = false;

  public static void main() {
    if (exercise) {
      return;
    }

    var service = new PointService(new PointIconFactory());
    for (var point: service.getPoints()) {
      point.draw();
    }
  }
}
