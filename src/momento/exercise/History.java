package momento.exercise;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
  private Deque<DocumentMomento> momentos = new ArrayDeque<>();

  public void push(DocumentMomento momento) {
    momentos.push(momento);
  }

  public DocumentMomento pop() {
    return momentos.pop();
  }

}
