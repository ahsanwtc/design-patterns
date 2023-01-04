package visitor;

import visitor.exercise.*;

public class VisitorDemo {
  public static boolean exercise = true;

  public static void main() {
    if (VisitorDemo.exercise) {
      var waveFile = new WavFileNew();
      waveFile.addSegment(new FormatSegmentNew());
      waveFile.addSegment(new FactSegmentNew());
      waveFile.addSegment(new FactSegmentNew());
      waveFile.addSegment(new FactSegmentNew());

      waveFile.execute(new ReverbFilter());
      waveFile.execute(new NoiseReductionFilter());
      waveFile.execute(new NormalizeFilter());

      return;
    }

    var document = new HtmlDocument();
    document.add(new AnchorNode());
    document.add(new HeadingNode());

    document.execute(new HighlighOperation());
    document.execute(new PlainTextOperation());

  }
}
