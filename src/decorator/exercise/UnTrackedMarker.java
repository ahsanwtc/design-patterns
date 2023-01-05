package decorator.exercise;

public class UnTrackedMarker implements IArtifact {
  private IArtifact marker;
  public UnTrackedMarker(IArtifact marker) {
    this.marker = marker;
  }

  @Override
  public String render() {
    return String.format("%s %s", marker.render(), "[untracked]");
  }
}
