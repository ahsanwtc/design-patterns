package flyweight.exercies.solution;

import java.util.Objects;

public class CellFormatting {
  private final String fontFamily;
  private final int fontSize;
  private final boolean isBold;

  public CellFormatting(String fontFamily, int fontSize, boolean isBold) {
    this.fontFamily = fontFamily;
    this.fontSize = fontSize;
    this.isBold = isBold;
  }

  public String getFontFamily() {
    return fontFamily;
  }

  public int getFontSize() {
    return fontSize;
  }

  public boolean isBold() {
    return isBold;
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontFamily, fontFamily, isBold);
  }

}
