package chainOfResponsibility.exercise;

public class NumbersReader extends Reader {
  public NumbersReader(Reader reader) {
    super(reader);
  }

  @Override
  public boolean doProcess(File file) {
    if (file.getExtension() == "numbers") {
      System.out.println("Reading data from a Numbers spreadsheet.");
      return true;
    }

    return false;
  }
}
