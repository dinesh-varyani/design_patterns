package in.techready.designpatterns.behavioral.command.before;

// RemoteControl class
public class RemoteControl {
    Light light;

    RemoteControl(Light light) {
        this.light = light;
    }
    void pressButton() {
        // Assume a single button for simplicity
        light.turnOn();
    }
}