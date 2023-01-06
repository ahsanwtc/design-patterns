package abstractFactory.solution;

import abstractFactory.exercise.IMealPlan;
import abstractFactory.exercise.IWorkoutPlan;

public interface IPlanFactory {
  IMealPlan createMealPlan();
  IWorkoutPlan createWorkoutPlan();
}
