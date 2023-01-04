package chainOfResponsibility.exercise;

public abstract class Reader {
  private Reader next;

  public Reader(Reader reader) {
    this.next = reader;
  }

  public void process(File file) {
    if (doProcess(file)) {
      return;
    }

    if (next != null) {
      next.process(file);
    }
  }

  public abstract boolean doProcess(File file);
}
