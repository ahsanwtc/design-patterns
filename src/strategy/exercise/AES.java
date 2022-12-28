package strategy.exercise;

public class AES implements Algorithm {
  public String encrypt(String message) {
    System.out.println("Encrypting message using AES");
    return message;
  }

  @Override
  public String decrypt(String cypher) {
    System.out.println("Decrypting message using AES");
    return cypher;
  }
}
