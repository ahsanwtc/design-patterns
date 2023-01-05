package bridge;

public class AdvancedRemoteControl extends RemoteControl {
  public AdvancedRemoteControl(IDevice device) {
    super(device);
  }

  public void setChannel(int number) {
    device.setChannel(number);
  }
}
