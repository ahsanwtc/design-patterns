package momento;

import momento.exercise.Document;
import momento.exercise.History;

public class Demo {
  public static void main() {
//    System.out.println("Running momento module");
//
//    var editor = new Editor();
//    var history = new History();
//
//    editor.setContent("a");
//    history.push(editor.createState());
//
//    editor.setContent("b");
//    history.push(editor.createState());
//
//    editor.setContent("c");
//    history.push(editor.createState());
//
//    editor.restoreState(history.pop());
//    System.out.println(editor.getContent());
//
//    editor.restoreState(history.pop());
//    System.out.println(editor.getContent());

    System.out.println("Running momento exercise");
    var document = new Document();
    var history = new History();

    document.setContent("a");
    history.push(document.createState());
    document.setFontName("calibri");
    history.push(document.createState());
    document.setFontSize(10);

    System.out.println(document);

    document.restoreState(history.pop());
    System.out.println(document);

    document.restoreState(history.pop());
    System.out.println(document);


  }
}
