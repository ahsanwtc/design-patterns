package abstractFactory;

import abstractFactory.ant.AntWidgetFactory;
import abstractFactory.app.ContactForm;
import abstractFactory.exercise.Demo;
import abstractFactory.material.MaterialWidgetFactory;

public class AbstractFactoryDemo {
  public static boolean exercise = true;

  public static void main() {
    if (exercise) {
      Demo.show();
      System.out.println("-------------------------------------------");
      Demo.solution();
      return;
    }

    new ContactForm().render(new MaterialWidgetFactory());
    new ContactForm().render(new AntWidgetFactory());
  }
}
