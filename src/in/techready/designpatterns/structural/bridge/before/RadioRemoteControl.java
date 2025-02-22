package in.techready.designpatterns.structural.bridge.before;

public class RadioRemoteControl implements RemoteControl {
    // Implementation for Radio
    @Override
    public void turnOn() {
        System.out.println("Turning on the Radio");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the Radio");
    }

    @Override
    public void changeChannel() {
        System.out.println("Changing the Radio channel");
    }
}

