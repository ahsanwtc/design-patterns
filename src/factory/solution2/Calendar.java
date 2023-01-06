package factory.solution2;

import java.util.Date;

public class Calendar implements ICalendar {
  public void addEvent(Event event, Date date) {
    System.out.println("[Base] Adding an event on the given date.");
  }
}
