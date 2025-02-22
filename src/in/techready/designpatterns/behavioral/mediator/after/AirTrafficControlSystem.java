package in.techready.designpatterns.behavioral.mediator.after;

// Client code using mediator
public class AirTrafficControlSystem {
    public static void main(String[] args) {
        Mediator mediator = new AirTrafficControlMediator();
        Airplane airplane1 = new Airplane("Flight 123",  
                                           mediator);
        Airplane airplane2 = new Airplane("Flight 456", 
                                           mediator);
        airplane1.sendMessage("Avoiding turbulence, change course", airplane2);
    }
}