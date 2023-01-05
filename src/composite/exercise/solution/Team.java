package composite.exercise.solution;

import java.util.ArrayList;
import java.util.List;

public class Team implements Member {
  private List<Member> resources = new ArrayList<>();

  public void add(Member resource) {
    resources.add(resource);
  }

  @Override
  public void deploy() {
    for (var resource : resources) {
      resource.deploy();
    }
  }
}