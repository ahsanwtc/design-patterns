package iterator;

public class IteratorDemo {
  static boolean exercise = true;
  public static void main() {
    if (IteratorDemo.exercise) {
      var collection = new ProductCollection();
      collection.add(new Product(1, "a"));
      collection.add(new Product(2, "b"));
      collection.add(new Product(3, "c"));

      Iterator iterator = collection.createIterator();
      while (iterator.hasNext()) {
        System.out.println(iterator.current());
        iterator.next();
      }

      return;
    }

    var history = new BrowseHistory();
    history.push("a");
    history.push("b");
    history.push("c");

    Iterator iterator = history.createIterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.current());
      iterator.next();
    }
  }
}
