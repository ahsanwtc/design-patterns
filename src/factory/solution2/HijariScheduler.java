package factory.solution2;

import java.util.Date;

public class HijariScheduler extends Scheduler {
  protected Calendar createCalendar() {
    return new HijariCalendar();
  }
}
