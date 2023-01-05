package adapter.exercise;

public class SMTPProvider implements EmailProvider {
  @Override
  public void downloadEmails() {
    System.out.println("Downloading SMTP emails");
  }
}
