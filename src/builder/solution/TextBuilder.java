package builder.solution;

public class TextBuilder implements IFileBuilder {
  private StringBuilder builder = new StringBuilder();
  @Override
  public void addElement(IElement element) {
    if (element instanceof Text) {
      var text = ((Text)element).getContent();
      builder.append(text);
    }
  }

  public String getText() {
    return builder.toString();
  }
}
