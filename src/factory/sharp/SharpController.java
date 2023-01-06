package factory.sharp;

import factory.matcha.Controller;
import factory.matcha.IViewEngine;

public class SharpController extends Controller {
  @Override
  protected IViewEngine createViewEngine() {
    return new SharpViewEngine();
  }
}
