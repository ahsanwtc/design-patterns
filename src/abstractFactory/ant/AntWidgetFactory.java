package abstractFactory.ant;

import abstractFactory.IButton;
import abstractFactory.ITextBox;
import abstractFactory.IWidgetFactory;

public class AntWidgetFactory implements IWidgetFactory {
  @Override
  public IButton createButton() {
    return new AntButton();
  }

  @Override
  public ITextBox createTextBox() {
    return new AntTextBox();
  }
}
