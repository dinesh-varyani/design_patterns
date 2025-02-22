package in.techready.designpatterns.creational.abstractfactory.before;

// Client code
public class Client {
    public static void main(String[] args) {
        // Creating UI components for Windows
        Button windowsButton = new WindowsButton();
        Window windowsWindow = new WindowsWindow();

        // Use Windows UI components
        windowsButton.render();
        windowsWindow.render();

        // Creating UI components for macOS
        Button macOSButton = new MacOSButton();
        Window macOSWindow = new MacOSWindow();

        // Use macOS UI components
        macOSButton.render();
        macOSWindow.render();
    }
}

