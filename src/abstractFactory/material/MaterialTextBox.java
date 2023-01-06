package abstractFactory.material;

import abstractFactory.ITextBox;

public class MaterialTextBox implements ITextBox {
  @Override
  public void render() {
    System.out.println("Material TextBox");
  }
}
