package strategy;

import strategy.exercise.AES;
import strategy.exercise.ChatClientNew;

public class StrategyDemo {
  public static boolean exercise = true;
  public static void main() {
    if (StrategyDemo.exercise) {
      var client = new ChatClientNew(new AES());
      client.send("a");
      client.send("b");
      return;
    }

    var imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
    imageStorage.store("a");

  }
}
