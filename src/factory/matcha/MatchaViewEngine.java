package factory.matcha;

import java.util.Map;

public class MatchaViewEngine implements IViewEngine {
  @Override
  public String render(String viewName, Map<String, Object> context) {
    return "View rendered by Matcha";
  }
}
