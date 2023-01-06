package prototype.exercise;

public class ContextMenu {
  private Timeline timeline;

  public ContextMenu(Timeline timeline) {
    this.timeline = timeline;
  }

  public void duplicate(IComponent component) {
    IComponent cloned = component.clone();
    timeline.add(cloned);

    /*
    if (component instanceof Text) {
      Text source = (Text)component;
      Text target = new Text(source.getContent());
      timeline.add(target);
    }
    else if (component instanceof Audio) {
      // Logic for duplicating an Audio object
    }
    else if (component instanceof Clip) {
      // Logic for duplicating a Clip object
    }
    */
  }
}
