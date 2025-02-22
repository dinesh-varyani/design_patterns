package in.techready.designpatterns.behavioral.mediator.after;

// Airplane class with mediator
public class Airplane {
    private String callsign;
    private Mediator mediator;

    public Airplane(String callsign, Mediator mediator) {
        this.callsign = callsign;
        this.mediator = mediator;
    }

    public void sendMessage(String message, 
                            Airplane destination) {
        mediator.sendMessage(message, this, destination);
    }

    

    public void receiveMessage(String message) {
        System.out.println(callsign + " receives message: " + 
                           message);
        // Logic for handling received message
    }

    public String getCallsign() {
        return callsign;
    }
}

