package strategy.exercise;

public class ChatClientNew {
  private Algorithm encryptionAlgorithm;

  public ChatClientNew(Algorithm encryptionAlgorithm) {
    this.encryptionAlgorithm = encryptionAlgorithm;
  }

  public void send(String message) {
    encryptionAlgorithm.encrypt(message);
    System.out.println("Sending the encrypted message...");
  }
}
