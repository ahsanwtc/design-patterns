package template;

import template.exercise.ChatWindow;

public class TemplateMethodDemo {
  public static boolean exercise = true;

  public static void main() {
    if (TemplateMethodDemo.exercise) {
      var window = new ChatWindow();
      window.close();
      return;
    }

    var task = new TransferMoneyTask();
    task.execute();
  }
}
