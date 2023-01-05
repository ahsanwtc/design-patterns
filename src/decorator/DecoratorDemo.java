package decorator;

public class DecoratorDemo {
  public static boolean exercise = false;

  public static void main() {
    if (exercise) {
      return;
    }

    storeData(new CompressedStream(new CloudStream()));
  }

  public static void storeData(Stream stream) {
    stream.write("some data to write");
  }
}
