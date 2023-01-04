package visitor.exercise;

public class NoiseReductionFilter implements Filter {
  @Override
  public void apply(FormatSegmentNew formatSegment) {
    System.out.println("Noise reduction filter on format segment");
  }

  @Override
  public void apply(FactSegmentNew factSegment) {
    System.out.println("Noise reduction filter on fact segment");
  }
}
