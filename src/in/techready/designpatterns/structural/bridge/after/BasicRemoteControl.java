package in.techready.designpatterns.structural.bridge.after;

// Abstraction
public class BasicRemoteControl implements RemoteControl {
    protected Device device;

    public BasicRemoteControl(Device device) {
        this.device = device;
    }

    @Override
    public void on() {
        device.turnOn();
    }

    @Override
    public void off() {
        device.turnOff();
    }
    
    @Override
    public void changeChannel() {
        device.changeChannel();
    }
}