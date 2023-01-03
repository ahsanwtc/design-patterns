package command;

import command.framework.Button;

public class CommandDemo {
  public static boolean exercise = false;
  public static void main() {
    var service = new CustomerService();
    var command = new AddCustomerCommand(service);
    var button = new Button(command);
    button.onClick();
  }
}
