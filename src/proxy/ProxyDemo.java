package proxy;

import proxy.exercise.Demo;

public class ProxyDemo {
  public static boolean exercise = true;

  public static void main() {
    if (exercise) {
      Demo.show();
      System.out.println("-------------------------------------------------");
      Demo.solution();
      return;
    }

    var library = new Library();
    String[] fileNames = { "a", "b", "c" };

    for (var fileName: fileNames) {
      library.add(new EbookProxy(fileName));
    }

    library.openEbook("a");
  }
}
