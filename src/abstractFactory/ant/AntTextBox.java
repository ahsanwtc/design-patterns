package abstractFactory.ant;

import abstractFactory.ITextBox;

public class AntTextBox implements ITextBox {
  @Override
  public void render() {
    System.out.println("Ant TextBox");
  }
}
