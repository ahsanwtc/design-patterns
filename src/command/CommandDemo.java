package command;

import command.editor.BoldCommand;
import command.editor.History;
import command.editor.HtmlDocument;
import command.editor.UndoCommand;
import command.framework.Button;

public class CommandDemo {
  public static boolean exercise = false;
  public static void main() {
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
