package proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
  private Map<String, IEbook> ebooks = new HashMap<>();

  public void add(IEbook ebook) {
    ebooks.put(ebook.getFileName(), ebook);
  }

  public void openEbook(String fileName) {
    ebooks.get(fileName).show();
  }
}
