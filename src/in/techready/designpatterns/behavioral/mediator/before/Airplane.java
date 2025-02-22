package in.techready.designpatterns.behavioral.mediator.before;

// Airplane class without mediator
public class Airplane {
    private String callsign;

    public Airplane(String callsign) {
        this.callsign = callsign;
    }

    public void sendMessage(String message, 
                            Airplane destination) {
        System.out.println(callsign + " sends message to " + 
                  destination.getCallsign() + ": " + message);
        // Logic for sending the message directly to the 
        // destination
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