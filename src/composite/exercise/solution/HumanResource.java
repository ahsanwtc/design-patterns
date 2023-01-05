package composite.exercise.solution;

public class HumanResource implements Member {
  @Override
  public void deploy() {
    System.out.println("Deploying a human resource");
  }
}
