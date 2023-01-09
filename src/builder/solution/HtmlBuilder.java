package builder.solution;

import builder.solution.html.HtmlParagraph;
import builder.solution.html.HtmlDocument;
import builder.solution.html.HtmlImage;

public class HtmlBuilder implements IFileBuilder {
  private HtmlDocument document = new HtmlDocument();
  @Override
  public void addElement(IElement element) {

    if (element instanceof Text) {
      var text = ((Text)element).getContent();
      document.add(new HtmlParagraph(text));
    }

    else if (element instanceof Image) {
      var source = ((Image)element).getSource();
      document.add(new HtmlImage(source));
    }
  }

  @Override
  public String getText() {
    return document.toString();
  }

  public String getDocument() {
    return document.toString();
  }

}
