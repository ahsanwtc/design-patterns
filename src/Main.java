import momento.Editor;
import momento.History;

public class Main {
  public static void main(String[] args) {
    /* Momento Pattern */
    var editor = new Editor();
    var history = new History();

    editor.setContent("a");
    history.push(editor.createState());

    editor.setContent("b");
    history.push(editor.createState());

    editor.setContent("c");
    history.push(editor.createState());

    editor.restoreState(history.pop());
    System.out.println(editor.getContent());

    editor.restoreState(history.pop());
    System.out.println(editor.getContent());
  }
}