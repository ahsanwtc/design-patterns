package strategy.exercise;

public class DES implements Algorithm {
  @Override
  public String encrypt(String message) {
    System.out.println("Encrypting message using DES");
    return message;
  }

  @Override
  public String decrypt(String cypher) {
    System.out.println("Decrypting message using DES");
    return cypher;
  }
}
