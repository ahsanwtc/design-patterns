package visitor.exercise;

public interface Filter {
  void apply(FormatSegmentNew formatSegment);
  void apply(FactSegmentNew factSegment);
}
