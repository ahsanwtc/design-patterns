package adapter;

import adapter.ThirdPartyPackage.Caramel;
import adapter.exercise.EmailClient;
import adapter.exercise.Gmail.GmailClient;
import adapter.exercise.GmailAdapter;
import adapter.exercise.SMTPProvider;

public class AdapterDemo {
  public static boolean exercise = true;

  public static void main() {
    if (AdapterDemo.exercise) {
      var client = new EmailClient();
      client.addProvider(new SMTPProvider());
      client.downloadEmails();

      client.addProvider(new GmailAdapter(new GmailClient()));
      client.downloadEmails();

      return;
    }

    var imageView = new ImageView(new Image());
    imageView.apply(new VividFilter());
    imageView.apply(new CaramelAdapter(new Caramel()));
  }
}
