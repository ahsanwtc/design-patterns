package prototype.exercise;

public class Text implements IComponent {
  private String content;

  public Text(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  @Override
  public IComponent clone() {
    return new Text(content);
  }
}
