package singleton;

public class SingletonDemo {
  public static boolean exercise = false;

  public static void main() {
    if (exercise) {
      return;
    }

    ConfigManager manager = ConfigManager.getInstance();
    manager.set("name", "a");

    ConfigManager other = ConfigManager.getInstance();
    System.out.println(other.get("name"));
  }
}
