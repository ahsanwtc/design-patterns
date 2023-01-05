package flyweight.exercies.solution;

import flyweight.PointIcon;
import flyweight.PointType;

import java.util.HashMap;
import java.util.Map;

public class CellFactory {
  private Map<Integer, CellFormatting> formattingMap = new HashMap<>();

  public CellFormatting getCellFormatting(String fontFamily, int fontSize, boolean isBold) {
    var formatting = new CellFormatting(fontFamily, fontSize, isBold);
    if (!formattingMap.containsKey(formatting.hashCode())) {
      formattingMap.put(formatting.hashCode(), formatting);
    }

    return formattingMap.get(formatting.hashCode());
  }
}
