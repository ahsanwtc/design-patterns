package visitor.exercise;

public class FactSegmentNew extends SegmentNew {
  @Override
  public void applyFiler(Filter filter) {
    filter.apply(this);
  }
}
