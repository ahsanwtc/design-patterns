package factory.solution2;

import java.util.Date;

public class GregionScheduler extends Scheduler {
  protected Calendar createCalendar() {
    return new GregorianCalendar();
  }
}
