package factory.solution;

import factory.exercise.Event;

import java.util.Date;

public class HijariCalendar extends Calendar {
  @Override
  public void addEvent(Event event, Date date) {
    System.out.println("[Hijari] Adding an event on the given date.");
  }
}
