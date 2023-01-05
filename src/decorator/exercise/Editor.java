package decorator.exercise;

public class Editor {
  public void openProject(String path) {
    Artefact[] artefacts = {
            new Artefact("Main"),
            new Artefact("Demo"),
            new Artefact("EmailClient"),
            new Artefact("EmailProvider"),
    };

    artefacts[0].setMain(true);
    artefacts[2].setHasError(true);

    for (var artefact : artefacts)
      System.out.println(artefact.render());


    System.out.println("---------------------------------------------");

    IArtifact[] artefactNew = {
            new ArtefactNew("Main"),
            new ArtefactNew("Demo"),
            new ArtefactNew("EmailClient"),
            new ArtefactNew("EmailProvider")
    };

    artefactNew[0] = new TrackedMarker(new MainMarker(artefactNew[0]));
    artefactNew[2] = new TrackedMarker(new ErrorMarker(artefactNew[2]));
    artefactNew[1] = new TrackedMarker(artefactNew[1]);
    artefactNew[3] = new UnTrackedMarker(artefactNew[3]);

    for (var artefact: artefactNew) {
      System.out.println(artefact.render());
    }

  }
}
