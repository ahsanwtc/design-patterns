package abstractFactory.solution;

import abstractFactory.exercise.BuildMuscleMealPlan;
import abstractFactory.exercise.BuildMuscleWorkout;
import abstractFactory.exercise.IMealPlan;
import abstractFactory.exercise.IWorkoutPlan;

public class BuildMusclePlan implements IPlanFactory {
  @Override
  public IMealPlan createMealPlan() {
    return new BuildMuscleMealPlan();
  }

  @Override
  public IWorkoutPlan createWorkoutPlan() {
    return new BuildMuscleWorkout();
  }
}
