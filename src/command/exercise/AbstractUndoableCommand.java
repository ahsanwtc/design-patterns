package command.exercise;

import command.editor.History;
import command.editor.UndoableCommand;

/*
* The purpose of this class is to make sure all undoable commands have
* a VideoEditor and a History. Plus, whenever a command is executed,
* it's pushed in the history. This way, we don't have to remember to
* store each individual command in the history.
* */
public abstract class AbstractUndoableCommand  implements UndoableCommand {
  protected VideoEditor editor;
  protected History history;

  public AbstractUndoableCommand(VideoEditor editor, History history) {
    this.editor = editor;
    this.history = history;
  }

  @Override
  public void execute() {
    /* Another application of the template method pattern. This method */
    /* is defining a template for executing commands.*/
    doExecute();
    history.push(this);
  }

  protected abstract void doExecute();
}
