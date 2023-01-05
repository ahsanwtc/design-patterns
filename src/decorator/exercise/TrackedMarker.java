package decorator.exercise;

public class TrackedMarker implements IArtifact {
  private IArtifact marker;
  public TrackedMarker(IArtifact marker) {
    this.marker = marker;
  }

  @Override
  public String render() {
    return String.format("%s %s", marker.render(), "[tracked]");
  }
}
