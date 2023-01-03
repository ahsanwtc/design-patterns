package command.exercise;

import command.editor.History;
import command.editor.UndoableCommand;

public class ChangeContrastCommand extends AbstractUndoableCommand {
  private float contrast;
  private float prevContrast;

  public ChangeContrastCommand(VideoEditor editor, History history, float contrast) {
    super(editor, history);
    this.prevContrast = editor.getContrast();
    this.contrast = contrast;
  }

  @Override
  protected void doExecute() {
    editor.setContrast(contrast);
  }

  @Override
  public void unexecute() {
    editor.setContrast(prevContrast);
  }
}
