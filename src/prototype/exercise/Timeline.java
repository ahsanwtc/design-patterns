package prototype.exercise;

import java.util.ArrayList;
import java.util.List;

public class Timeline {
  private List<IComponent> components = new ArrayList<>();

  public void add(IComponent component) {
    components.add(component);
  }
}
