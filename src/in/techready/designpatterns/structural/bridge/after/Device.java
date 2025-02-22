package in.techready.designpatterns.structural.bridge.after;

// Implementor Interface
public interface Device {
    void turnOn();
    void turnOff();
    void changeChannel();
    void setVolume(int volume);
}