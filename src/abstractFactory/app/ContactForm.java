package abstractFactory.app;

import abstractFactory.IWidgetFactory;

public class ContactForm {
  public void render(IWidgetFactory factory) {
    factory.createButton().render();
    factory.createTextBox().render();
  }
}
