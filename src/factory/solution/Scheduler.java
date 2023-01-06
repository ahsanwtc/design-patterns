package factory.solution;

import factory.exercise.Event;

import java.util.Date;

public class Scheduler {
  private ICalendar calendar;

  public Scheduler(ICalendar calendar) {
    this.calendar = calendar;
  }

  public void schedule(Event event) {
    var today = new Date();
    calendar.addEvent(event, today);
  }
}
