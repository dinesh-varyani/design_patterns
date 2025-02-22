package in.techready.designpatterns.structural.bridge.after;

public class Radio implements Device {
    private int volume = 10;

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

    @Override
    public void setVolume(int volume) {
        System.out.println("Changing the Radio volume to - " + 
                            volume);
        this.volume = volume;
    }
}