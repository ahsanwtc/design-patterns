package decorator.exercise;

public class ArtefactNew implements IArtifact {
  private String name;

  public ArtefactNew(String name) {
    this.name = name;
  }

  public String render() {
    return name;
  }
}
