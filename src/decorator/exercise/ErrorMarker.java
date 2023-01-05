package decorator.exercise;

public class ErrorMarker implements IArtifact {
  private IArtifact marker;
  public ErrorMarker(IArtifact marker) {
    this.marker = marker;
  }

  @Override
  public String render() {
    return String.format("%s %s", marker.render(), "[Error]");
  }
}
