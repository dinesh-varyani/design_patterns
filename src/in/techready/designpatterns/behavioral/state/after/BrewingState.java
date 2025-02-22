package in.techready.designpatterns.behavioral.state.after;

public class BrewingState implements CoffeeMachineState {
    @Override
    public void performAction() {
        System.out.println("Cannot perform action while brewing.");
        // Additional logic for handling actions in the 
        // 'brewing' state
    }
}