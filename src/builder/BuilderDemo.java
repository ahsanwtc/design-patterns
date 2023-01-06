package builder;

import builder.exercise.Demo;

import java.io.IOException;

public class BuilderDemo {
  public static boolean exercise = true;

  public static void main() {
    if (exercise) {
      try {
        Demo.show();
        Demo.solution();
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
      return;
    }

    var presentation = new Presentation();
    presentation.addSlide(new Slide("Slide 1"));
    presentation.addSlide(new Slide("Slide 2"));

    presentation.export(new PdfDocumentBuilder());
  }
}
