package command;

import command.editor.BoldCommand;
import command.editor.History;
import command.editor.HtmlDocument;
import command.editor.UndoCommand;
import command.exercise.ChangeContrastCommand;
import command.exercise.ChangeTextCommand;
import command.exercise.VideoEditor;
import command.framework.Button;

public class CommandDemo {
  public static boolean exercise = true;
  public static void main() {

    if (CommandDemo.exercise) {
      var videoEditor = new VideoEditor();
      var vHistory = new History();
      System.out.println("INITIAL: " + videoEditor);

      var setTextCommand = new ChangeTextCommand(videoEditor, vHistory, "Title");
      setTextCommand.execute();
      System.out.println("TEXT: " + videoEditor);

      var setContrastCommand = new ChangeContrastCommand(videoEditor, vHistory, 0.7f);
      setContrastCommand.execute();
      System.out.println("CONTRAST: " + videoEditor);

      var undoCommand = new UndoCommand(vHistory);
      undoCommand.execute();
      System.out.println("UNDO: " + videoEditor);

      undoCommand.execute();
      System.out.println("UNDO: " + videoEditor);

      undoCommand.execute();
      System.out.println("UNDO: " + videoEditor);

      return;
    }

    /* simple command */
    var service = new CustomerService();
    var command = new AddCustomerCommand(service);
    var button = new Button(command);
    button.onClick();

    /* composite command */
    var commands = new CompositeCommand();
    commands.add(new ResizeCommand());
    commands.add(new BlackAndWhiteCommand());
    commands.execute();

    // replaying a composite command
    commands.execute();

    /* undoable command */
    System.out.println(".....undoable command.....");
    var document = new HtmlDocument();
    var history = new History();
    document.setContent("Hello World");

    var boldCommand = new BoldCommand(document, history);
    boldCommand.execute();
    System.out.println(document.getContent());

    // undo
    var undoCommand = new UndoCommand(history);
    undoCommand.execute();
    System.out.println(document.getContent());
  }
}
