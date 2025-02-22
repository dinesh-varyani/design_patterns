package in.techready.designpatterns.creational.abstractfactory.after;

// Concrete factory for macOS
public class MacOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Window createWindow() {
        return new MacOSWindow();
    }
}