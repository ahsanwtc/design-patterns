package abstractFactory;

public interface IWidgetFactory {
  IButton createButton();
  ITextBox createTextBox();
}
