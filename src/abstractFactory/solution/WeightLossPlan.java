package abstractFactory.solution;

import abstractFactory.exercise.IMealPlan;
import abstractFactory.exercise.IWorkoutPlan;
import abstractFactory.exercise.WeighLossMealPlan;
import abstractFactory.exercise.WeightLossWorkout;

public class WeightLossPlan implements IPlanFactory {
  @Override
  public IMealPlan createMealPlan() {
    return new WeighLossMealPlan();
  }

  @Override
  public IWorkoutPlan createWorkoutPlan() {
    return new WeightLossWorkout();
  }
}
