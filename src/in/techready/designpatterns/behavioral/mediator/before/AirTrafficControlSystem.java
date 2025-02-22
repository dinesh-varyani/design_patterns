package in.techready.designpatterns.behavioral.mediator.before;

// Client code
public class AirTrafficControlSystem {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Flight 123");
        Airplane airplane2 = new Airplane("Flight 456");

        airplane1.sendMessage("Avoiding turbulence, change course", airplane2);
    }
} 

