package chainOfResponsibility.exercise;

public class QuickbooksReader extends Reader {
  public QuickbooksReader(Reader reader) {
    super(reader);
  }

  @Override
  public boolean doProcess(File file) {
    if (file.getExtension() == "qbw") {
      System.out.println("Reading data from a QuickBooks file.");
      return true;
    }

    return false;
  }
}
