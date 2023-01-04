package visitor.exercise;

import java.util.ArrayList;
import java.util.List;

public class WavFileNew {
  private List<SegmentNew> segments = new ArrayList<>();

  /*
  public static WavFileNew read(String fileName) {
    // Simulate reading a wav file and building the segments
    var wavFile = new WavFileNew();
    wavFile.segments.add(new FormatSegment());
    wavFile.segments.add(new FactSegment());
    wavFile.segments.add(new FactSegment());
    wavFile.segments.add(new FactSegment());

    return wavFile;
  }
  */

  public void addSegment(SegmentNew segment) {
    segments.add(segment);
  }

  public void execute(Filter filter) {
    for (var segment: segments) {
      segment.applyFiler(filter);
    }
  }
}
