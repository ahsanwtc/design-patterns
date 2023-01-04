package mediator.exercise;

import mediator.Button;
import mediator.TextBox;

public class SignUpDialogBox {
  private TextBox username = new TextBox();
  private TextBox password = new TextBox();
  private CheckBox agreeToTerms = new CheckBox();
  private Button signup = new Button();

  public SignUpDialogBox() {
    username.addEventHandler(this::checkForm);
    password.addEventHandler(this::checkForm);
    agreeToTerms.addEventHandler(this::checkForm);
  }

  public void simulateUserInteraction() {
    username.setContent("user");
    password.setContent("password");
    String output = String.format("username: %s, password: %s, agreeToTerms: %b", username.getContent(), password.getContent(), agreeToTerms.isSelected());
    System.out.println(output);
    System.out.println("Button: " + signup.isEnabled());

    agreeToTerms.setSelected(true);
    output = String.format("username: %s, password: %s, agreeToTerms: %b", username.getContent(), password.getContent(), agreeToTerms.isSelected());
    System.out.println(output);
    System.out.println("Button: " + signup.isEnabled());
  }

  private void checkForm() {
    signup.setEnabled(false);
    var isUsernameEmpty = (username.getContent() == null || username.getContent().isEmpty());
    var isPasswordEmpty = (password.getContent() == null || password.getContent().isEmpty());
    if (!isUsernameEmpty && !isPasswordEmpty && agreeToTerms.isSelected()) {
      signup.setEnabled(true);
    }
  }
}
