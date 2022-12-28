package template.exercise;

public class ChatWindow extends Window {
  @Override
  protected void onClosing() {

  }

  @Override
  protected void onClosed() {
    System.out.println("Disconnecting from the server...");
  }
}
