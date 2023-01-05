package decorator;

public class CompressedStream implements Stream {
  private Stream stream;

  public CompressedStream(Stream stream) {
    this.stream = stream;
  }

  @Override
  public void write(String data) {
    stream.write(compress(data));
  }

  private String compress(String data) {
    return data.substring(0, 5);
  }
}
