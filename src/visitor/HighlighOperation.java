package visitor;

public class HighlighOperation implements Operation {
  @Override
  public void apply(AnchorNode anchorNode) {
    System.out.println("highlight-anchor");
  }

  @Override
  public void apply(HeadingNode headingNode) {
    System.out.println("highlight-heading");
  }
}
