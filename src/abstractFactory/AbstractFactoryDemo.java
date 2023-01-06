package abstractFactory;

import abstractFactory.ant.AntWidgetFactory;
import abstractFactory.app.ContactForm;
import abstractFactory.material.MaterialWidgetFactory;

public class AbstractFactoryDemo {
  public static boolean exercise = false;

  public static void main() {
    if (exercise) {
      return;
    }

    new ContactForm().render(new MaterialWidgetFactory());
    new ContactForm().render(new AntWidgetFactory());
  }
}
