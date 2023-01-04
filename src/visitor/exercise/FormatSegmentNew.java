package visitor.exercise;

public class FormatSegmentNew extends SegmentNew {
  @Override
  public void applyFiler(Filter filter) {
    filter.apply(this);
  }
}
