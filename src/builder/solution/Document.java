package builder.solution;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Document {
  private List<IElement> elements = new ArrayList<>();

  public void add(IElement element) {
    elements.add(element);
  }

  public void export(IFileBuilder fileBuilder, String fileName) throws IOException {
    for (IElement element: elements) {
      fileBuilder.addElement(element);
    }

    var content = fileBuilder.getText();
    var writer = new FileWriter(fileName);
    writer.write(content);
    writer.close();
  }
}
