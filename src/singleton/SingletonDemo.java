package singleton;

import singleton.solution.Logger;

public class SingletonDemo {
  public static boolean exercise = true;

  public static void main() {
    if (exercise) {
      var logger1 = Logger.getInstance("file1");
      var logger2 = Logger.getInstance("file1");
      System.out.println(logger1 == logger2);

      var logger3 = Logger.getInstance("file3");
      System.out.println(logger1 == logger3);
      return;
    }

    ConfigManager manager = ConfigManager.getInstance();
    manager.set("name", "a");

    ConfigManager other = ConfigManager.getInstance();
    System.out.println(other.get("name"));
  }
}
