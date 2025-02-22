package in.techready.designpatterns.creational.abstractfactory.after;

// Client code using Abstract Factory
public class Client {

    private static UIFactory factory;

    public static void main(String[] args) {

        // Create UI components using the Abstract Factory
        String osName = 
            System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSUIFactory();
        } else {
            factory = new WindowsUIFactory();
        }
    }

    public static void renderUI() {
        Button button = factory.createButton();
        Window window = factory.createWindow();
        button.render();
        window.render();
    }
}