package in.techready.designpatterns.creational.abstractfactory.after;

// Concrete factory for Windows
public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}