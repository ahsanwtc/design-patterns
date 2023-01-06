package factory.solution2;

import java.util.Date;

public class Scheduler implements IScheduler {
  private ICalendar calendar = createCalendar();

  @Override
  public void schedule(Event event) {
    var today = new Date();
    calendar.addEvent(event, today);
  }

  protected Calendar createCalendar() {
    return new Calendar();
  }
}
