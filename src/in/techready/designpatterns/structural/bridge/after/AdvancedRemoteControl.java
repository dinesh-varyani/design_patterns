package in.techready.designpatterns.structural.bridge.after;

// Refined Abstraction
public class AdvancedRemoteControl extends BasicRemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute(){
        device.setVolume(0);
    }
}