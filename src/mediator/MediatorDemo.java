package mediator;

import mediator.exercise.SignUpDialogBox;

public class MediatorDemo {
  public static boolean exercise = true;

  public static void main() {
    if (MediatorDemo.exercise) {
      var signupDialogBox = new SignUpDialogBox();
      signupDialogBox.simulateUserInteraction();
      return;
    }

    var articlesDialogBox = new ArticlesDialogBox();
    articlesDialogBox.simulateUserInteraction();
  }
}
