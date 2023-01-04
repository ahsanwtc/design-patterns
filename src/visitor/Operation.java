package visitor;

public interface Operation {
  void apply(AnchorNode anchorNode);
  void apply(HeadingNode headingNode);

}
