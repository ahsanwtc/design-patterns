package factory.solution;

import factory.exercise.Event;

import java.util.Date;

public abstract class Calendar implements ICalendar {
  @Override
  public abstract void addEvent(Event event, Date date);
}
