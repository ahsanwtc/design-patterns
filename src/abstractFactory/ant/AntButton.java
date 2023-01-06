package abstractFactory.ant;

import abstractFactory.IButton;

public class AntButton implements IButton {
  @Override
  public void render() {
    System.out.println("Ant Button");
  }
}
