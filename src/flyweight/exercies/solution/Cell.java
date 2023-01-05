package flyweight.exercies.solution;

public class Cell {
  private final int row;
  private final int column;
  private CellFormatting cellFormatting;
  private String content;


  public Cell(int row, int column, CellFormatting cellFormatting) {
    this.row = row;
    this.column = column;
    this.cellFormatting = cellFormatting;
  }

  public CellFormatting getCellFormatting() {
    return cellFormatting;
  }

  public void setCellFormatting(CellFormatting cellFormatting) {
    this.cellFormatting = cellFormatting;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void render() {
    System.out.printf("(%d, %d): %s [%s]", row, column, content, cellFormatting.getFontFamily());
  }
}
