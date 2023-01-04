package visitor;

public class PlainTextOperation implements Operation {
  @Override
  public void apply(AnchorNode anchorNode) {
    System.out.println("text-anchor");
  }

  @Override
  public void apply(HeadingNode headingNode) {
    System.out.println("text-heading");
  }
}
