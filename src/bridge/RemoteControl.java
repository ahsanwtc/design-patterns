package bridge;

public class RemoteControl {
  protected IDevice device;

  public RemoteControl(IDevice device) {
    this.device = device;
  }

  public void turnOn() {
    device.turnOn();
  }

  public void turnOff() {
    device.turnOff();
  }
}
