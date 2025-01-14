package in.techready.designpatterns.solid.dip.before;

class LightBulb {
    public void turnOn() {
        System.out.println("Light bulb is on.");
    }

    public void turnOff() {
        System.out.println("Light bulb is off.");
    }
}

public class LightSwitch {
    private LightBulb bulb;

    public LightSwitch(LightBulb bulb) {
        this.bulb = bulb;
    }

    public void operate() {
        // Operating the light switch
        boolean condition = true; // condition to on or off light
        if (condition) {
            bulb.turnOn();
        } else {
            bulb.turnOff();
        }
    }
}
