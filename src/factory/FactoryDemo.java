package factory;

public class FactoryDemo {
  public static boolean exercise = false;

  public static void main() {
    if (exercise) {
      return;
    }

    new ProductsController().listProducts();
  }
}
