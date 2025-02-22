package in.techready.designpatterns.behavioral.mediator.after;

// Concrete mediator class
public class AirTrafficControlMediator implements Mediator {

    @Override
    public void sendMessage(String message, Airplane sender, 
                                          Airplane receiver) {
        System.out.println(sender.getCallsign() + " sends message to " + receiver.getCallsign() + ": " + 
            message);
        // Logic for handling the message and relaying it to 
        // the receiver
        receiver.receiveMessage(message);
    }
}