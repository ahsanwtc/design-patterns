package mediator.exercise;

import mediator.UIControl;

public class CheckBox extends UIControl {
  private boolean selected;

  public boolean isSelected() {
    return selected;
  }

  public void setSelected(boolean selected) {
    this.selected = selected;
    notifyEventHandlers();
  }
}
