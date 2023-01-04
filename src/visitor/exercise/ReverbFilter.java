package visitor.exercise;

public class ReverbFilter implements Filter {
  @Override
  public void apply(FormatSegmentNew formatSegment) {
    System.out.println("Reverb filter on format segment");
  }

  @Override
  public void apply(FactSegmentNew factSegment) {
    System.out.println("Reverb filter on fact segment");
  }
}
