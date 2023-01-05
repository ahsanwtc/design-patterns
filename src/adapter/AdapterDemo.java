package adapter;

import adapter.ThirdPartyPackage.Caramel;

public class AdapterDemo {
  public static boolean exercise = false;

  public static void main() {
    if (AdapterDemo.exercise) {
      return;
    }

    var imageView = new ImageView(new Image());
    imageView.apply(new VividFilter());
    imageView.apply(new CaramelAdapter(new Caramel()));
  }
}
