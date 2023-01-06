package factory;

import factory.exercise.Demo;

public class FactoryDemo {
  public static boolean exercise = true;

  public static void main() {
    if (exercise) {
      System.out.println("Exercise");
      Demo.show();
      System.out.println("----------------------------------");
      System.out.println("Solution");
      Demo.solution();
      System.out.println("----------------------------------");
      System.out.println("Solution 2");
      Demo.solution2();
      return;
    }

    new ProductsController().listProducts();
  }
}
