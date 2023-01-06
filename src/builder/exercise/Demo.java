package builder.exercise;

import builder.solution.HtmlBuilder;
import builder.solution.TextBuilder;

import java.io.IOException;

public class Demo {
  public static void show() throws IOException {
    var document = new Document();
    document.add(new Text("Hello World"));
    document.add(new Image("pic1.jpg"));

    String path = System.getProperty("user.dir") + "/src/builder/exercise/";

    document.export(ExportFormat.HTML, path + "export.html");

    // Only writes the text elements to the file
    document.export(ExportFormat.TEXT, path + "export.txt");
  }

  public static void solution() throws IOException {
    var document = new builder.solution.Document();
    document.add(new builder.solution.Text("Hello World"));
    document.add(new builder.solution.Image("pic1.jpg"));

    String path = System.getProperty("user.dir") + "/src/builder/solution/";

    // document.export(new HtmlBuilder(), path + "export.html");

    // Only writes the text elements to the file
    document.export(new TextBuilder(), path + "export.txt");
  }
}
