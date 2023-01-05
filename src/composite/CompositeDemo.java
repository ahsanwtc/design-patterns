package composite;

import composite.exercise.solution.HumanResource;
import composite.exercise.solution.Team;
import composite.exercise.solution.Truck;

public class CompositeDemo {
  public static boolean exercise = true;

  public static void main() {
    if (CompositeDemo.exercise) {
      var subTeam1 = new Team();
      subTeam1.add(new Truck());
      subTeam1.add(new HumanResource());
      subTeam1.add(new HumanResource());

      var subTeam2 = new Team();
      subTeam1.add(new Truck());
      subTeam1.add(new HumanResource());
      subTeam1.add(new HumanResource());

      var team = new Team();
      team.add(subTeam1);
      team.add(subTeam2);

      team.deploy();

      return;
    }

    var group1 = new Group();
    group1.add(new Shape()); // square
    group1.add(new Shape()); // square

    var group2 = new Group();
    group2.add(new Shape()); // circle
    group2.add(new Shape()); // circle

    var group3 = new Group();
    group3.add(group1);
    group3.add(group2);

    group3.render();
    group3.move();
  }
}
