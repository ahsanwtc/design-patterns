package decorator.exercise;

public class MainMarker implements IArtifact {
  private IArtifact marker;

  public MainMarker(IArtifact marker) {
    this.marker = marker;
  }

  @Override
  public String render() {
    var tag = marker.render();
    return String.format("%s %s", tag, "[Main]");
  }
}
