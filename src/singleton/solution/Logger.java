package singleton.solution;

import java.util.HashMap;
import java.util.Map;

public class Logger {
  private static Map<String, Logger> instances = new HashMap<>();
  //private String fileName;

  private Logger() {}

  //public Logger(String fileName) {
    // this.fileName = fileName;
  //}

  public static Logger getInstance(String fileName) {
    if (!instances.containsKey(fileName)) {
      instances.put(fileName, new Logger());
    }

    return instances.get(fileName);
  }


}
