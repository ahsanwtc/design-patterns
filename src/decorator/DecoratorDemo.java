package decorator;

import decorator.exercise.Demo;

public class DecoratorDemo {
  public static boolean exercise = true;

  public static void main() {
    if (exercise) {
      Demo.show();
      return;
    }

    storeData(new CompressedStream(new CloudStream()));
  }

  public static void storeData(Stream stream) {
    stream.write("some data to write");
  }
}
