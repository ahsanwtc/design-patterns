package abstractFactory.material;

import abstractFactory.IButton;

public class MaterialButton implements IButton {
  @Override
  public void render() {
    System.out.println("Material Button");
  }
}
