package decorator;

public class EncryptedStream implements Stream {
  private Stream stream;

  public EncryptedStream(Stream stream) {
    this.stream = stream;
  }

  private String encrypt(String data) {
    return "(*23(*^guhg*&^TGH5";
  }

  @Override
  public void write(String data) {
    stream.write(encrypt(data));
  }
}
