package in.techready.designpatterns.behavioral.state.after;

// Concrete state classes
public class IdleState implements CoffeeMachineState {
    @Override
    public void performAction() {
        System.out.println("Preparing coffee...");
        // Additional logic for preparing coffee in the 'idle' 
        // state. Transition to the 'brewing' state if needed
        // context.setState(new BrewingState());
    }
}