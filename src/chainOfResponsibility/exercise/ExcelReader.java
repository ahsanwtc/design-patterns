package chainOfResponsibility.exercise;

public class ExcelReader extends Reader {
  public ExcelReader(Reader reader) {
    super(reader);
  }

  @Override
  public boolean doProcess(File file) {
    if (file.getExtension() == "xls") {
      System.out.println("Reading data from an Excel spreadsheet.");
      return true;
    }

    return false;
  }
}
