package state;

public class StateDemo {
  static boolean exercise = false;
  public static void main() {
    if (StateDemo.exercise == false) {
      var canvas = new Canvas();
      canvas.setCurrentTool(new SelectionTool());
      canvas.mouseDown();
      canvas.mouseUp();

      canvas.setCurrentTool(new BrushTool());
      canvas.mouseDown();
      canvas.mouseUp();

      canvas.setCurrentTool(new EraserTool());
      canvas.mouseDown();
      canvas.mouseUp();
    }
  }
}
