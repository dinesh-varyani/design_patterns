package in.techready.designpatterns.structural.bridge.after;

// Concrete Implementations
public class TV implements Device {
    private int volume = 25;

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

    @Override
    public void setVolume(int volume) {
        System.out.println("Changing the TV volume to - " + 
                           volume);
        this.volume = volume;
    }
}