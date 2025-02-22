package in.techready.designpatterns.behavioral.mediator.after;

// Mediator interface
public interface Mediator {
    void sendMessage(String message, Airplane sender, 
                                     Airplane receiver);
}