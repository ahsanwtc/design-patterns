package visitor;

public class VisitorDemo {
  public static boolean exercise = false;

  public static void main() {
    if (VisitorDemo.exercise) {
      return;
    }

    var document = new HtmlDocument();
    document.add(new AnchorNode());
    document.add(new HeadingNode());

    document.execute(new HighlighOperation());
    document.execute(new PlainTextOperation());

  }
}
