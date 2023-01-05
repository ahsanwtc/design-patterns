package proxy;

public class EbookProxy implements IEbook {
  private String fileName;
  private Ebook ebook;

  public EbookProxy(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void show() {
    if (ebook == null)
      ebook = new Ebook(fileName);

    ebook.show();
  }

  @Override
  public String getFileName() {
    return fileName;
  }
}
