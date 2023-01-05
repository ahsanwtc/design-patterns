package bridge;

public class LGTV implements IDevice {
  @Override
  public void turnOn() {
    System.out.println("LG: turnOn");
  }

  @Override
  public void turnOff() {
    System.out.println("LG: turnOff");
  }

  @Override
  public void setChannel(int number) {
    System.out.println("LG: setChannel " + number);
  }
}
