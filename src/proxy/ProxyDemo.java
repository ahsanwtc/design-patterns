package proxy;

public class ProxyDemo {
  public static boolean exercise = false;

  public static void main() {
    if (exercise) {
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
