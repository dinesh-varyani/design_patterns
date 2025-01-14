package in.techready.designpatterns.solid.dip.after;

public interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light bulb is on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light bulb is off.");
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan is on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is off.");
    }
}

class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        // Operating the switch
        boolean condition = true; // some condition
        if (condition) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
}
