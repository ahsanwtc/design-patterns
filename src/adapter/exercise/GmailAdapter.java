package adapter.exercise;

import adapter.exercise.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
  private GmailClient gmailClient;

  public GmailAdapter(GmailClient gmailClient) {
    this.gmailClient = gmailClient;
  }

  @Override
  public void downloadEmails() {
    gmailClient.connect();
    gmailClient.getEmails();
    gmailClient.disconnect();
  }
}
