package mediator;

public class MediatorDemo {
  public static boolean exercise = false;

  public static void main() {
    if (MediatorDemo.exercise) {
      return;
    }

    var articlesDialogBox = new ArticlesDialogBox();
    articlesDialogBox.simulateUserInteraction();
  }
}
