package abstractFactory.exercise;

import abstractFactory.solution.WeightLossPlan;

public class Demo {
  public static void show() {
    var homePage = new HomePage();
    homePage.setGoal(Goal.WEIGHT_LOSS);
  }

  public static void solution() {
    var homePage = new abstractFactory.solution.HomePage();
    homePage.setGoal(new WeightLossPlan());
  }
}
