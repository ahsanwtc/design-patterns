package command;

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
  }
}
