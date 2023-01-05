package bridge;

public class BridgeDemo {
  public static void main() {
    var basicRemote = new RemoteControl(new SonyTV());
    basicRemote.turnOn();

    var advancedRemote = new AdvancedRemoteControl(new LGTV());
    advancedRemote.setChannel(2);
  }
}
