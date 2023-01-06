package builder;

public class BuilderDemo {
  public static boolean exercise = false;

  public static void main() {
    if (exercise) {
      return;
    }

    var presentation = new Presentation();
    presentation.addSlide(new Slide("Slide 1"));
    presentation.addSlide(new Slide("Slide 2"));

    presentation.export(new PdfDocumentBuilder());
  }
}
