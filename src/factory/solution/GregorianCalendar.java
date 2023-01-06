package factory.solution;

import factory.exercise.Event;

import java.util.Date;

public class GregorianCalendar extends Calendar {
  @Override
  public void addEvent(Event event, Date date) {
    System.out.println("[Gregorian] Adding an event on the given date.");
  }
}
