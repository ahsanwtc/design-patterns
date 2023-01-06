package factory.solution;

import factory.exercise.Event;

import java.util.Date;

public interface ICalendar {
  void addEvent(Event event, Date date);
}
