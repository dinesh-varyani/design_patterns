package in.techready.designpatterns.structural.bridge.before;

// Concrete Implementations
public class TVRemoteControl implements RemoteControl {
    // Implementation for TV
    @Override
    public void turnOn() {
        System.out.println("Turning on the TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the TV");
    }

    @Override
    public void changeChannel() {
        System.out.println("Changing the TV channel");
    }
}