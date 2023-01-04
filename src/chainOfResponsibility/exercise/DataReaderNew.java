package chainOfResponsibility.exercise;

public class DataReaderNew {
  private Reader reader;

  public DataReaderNew(Reader reader) {
    this.reader = reader;
  }

  public void read(File file) {
    reader.process(file);
  }
}
