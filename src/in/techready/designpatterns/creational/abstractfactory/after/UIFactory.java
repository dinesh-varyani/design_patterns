package in.techready.designpatterns.creational.abstractfactory.after;

// Abstract factory interface
public interface UIFactory {
    Button createButton();
    Window createWindow();
}