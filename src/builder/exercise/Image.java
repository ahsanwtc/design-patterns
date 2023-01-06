package builder.exercise;

public class Image implements IElement {
  private String source;

  public Image(String source) {
    this.source = source;
  }

  public String getSource() {
    return source;
  }
}
