package factory.exercise;

import factory.solution.GregorianCalendar;
import factory.solution.HijariCalendar;

public class Demo {
  public static void show() {
    var scheduler = new Scheduler();
    scheduler.schedule(new Event());
  }

  public static void solution() {
    var gScheduler = new factory.solution.Scheduler(new GregorianCalendar());
    gScheduler.schedule(new Event());

    var hScheduler = new factory.solution.Scheduler(new HijariCalendar());
    hScheduler.schedule(new Event());
  }

  public static void solution2() {
    var bScheduler = new factory.solution2.Scheduler();
    bScheduler.schedule(new factory.solution2.Event());
  }
}
