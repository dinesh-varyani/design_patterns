package in.techready.designpatterns.behavioral.state.after;

public class FinishedState implements CoffeeMachineState {
    @Override
    public void performAction() {
        System.out.println("Coffee already prepared. Please reset.");
        // Additional logic for handling actions in the 
        // 'finished' state
    }
}