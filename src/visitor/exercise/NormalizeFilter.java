package visitor.exercise;

public class NormalizeFilter implements Filter {
  @Override
  public void apply(FormatSegmentNew formatSegment) {
    System.out.println("Normalize filter on format segment");
  }

  @Override
  public void apply(FactSegmentNew factSegment) {
    System.out.println("Normalize filter on fact segment");
  }
}
