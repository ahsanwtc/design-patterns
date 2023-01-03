package command.exercise;

import command.editor.History;
import command.editor.UndoableCommand;

public class ChangeTextCommand extends AbstractUndoableCommand {
  private String text;

  public ChangeTextCommand(VideoEditor editor, History history, String text) {
    super(editor, history);
    this.text = text;
  }

  @Override
  protected void doExecute() {
    editor.setText(text);
  }

  @Override
  public void unexecute() {
    editor.removeText();
  }
}
