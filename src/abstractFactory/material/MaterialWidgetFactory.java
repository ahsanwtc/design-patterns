package abstractFactory.material;

import abstractFactory.IButton;
import abstractFactory.ITextBox;
import abstractFactory.IWidgetFactory;

public class MaterialWidgetFactory implements IWidgetFactory {
  @Override
  public IButton createButton() {
    return new MaterialButton();
  }

  @Override
  public ITextBox createTextBox() {
    return new MaterialTextBox();
  }
}
