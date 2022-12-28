package template;

public class TemplateMethodDemo {
  public static boolean exercise = false;

  public static void main() {
    if (TemplateMethodDemo.exercise) {
      return;
    }

    var task = new TransferMoneyTask();
    task.execute();
  }
}
