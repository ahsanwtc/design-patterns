package builder;

public class PdfDocumentBuilder implements IPresentationBuilder {
  private PdfDocument document = new PdfDocument();

  @Override
  public void addSlide(Slide slide) {
    document.addPage(slide.getText());
  }

  public PdfDocument getPdfDocument() {
    return document;
  }
}
