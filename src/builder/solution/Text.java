package builder.solution;
public class Text implements IElement {
  private String content;

  public Text(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }
}
