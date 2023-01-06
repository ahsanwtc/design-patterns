package factory.sharp;

import factory.matcha.IViewEngine;

import java.util.Map;

public class SharpViewEngine implements IViewEngine {
  @Override
  public String render(String viewName, Map<String, Object> context) {
    return "View rendered by Sharp";
  }
}
