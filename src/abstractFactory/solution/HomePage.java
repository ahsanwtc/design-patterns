package abstractFactory.solution;

import abstractFactory.exercise.IMealPlan;
import abstractFactory.exercise.IWorkoutPlan;

public class HomePage {
  private IWorkoutPlan workoutPlan;
  private IMealPlan mealPlan;

  public void setGoal(IPlanFactory factory) {
    workoutPlan = factory.createWorkoutPlan();
    mealPlan = factory.createMealPlan();

    System.out.println(workoutPlan);
    System.out.println(mealPlan);

  }
}
