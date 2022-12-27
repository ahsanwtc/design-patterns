package state;

import state.exercise.DirectionServiceNew;
import state.exercise.Walking;

public class StateDemo {
  static boolean exercise = true;
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
    } else {
      DirectionServiceNew directionService = new DirectionServiceNew(new Walking());
      directionService.getEta();
      directionService.getDirection();
    }
  }
}
