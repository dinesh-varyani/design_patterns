package in.techready.designpatterns.behavioral.state.after;

// Context class (main object)
public class CoffeeMachine {
    private CoffeeMachineState currentState;

    public CoffeeMachine() {
        // Initial state
        this.currentState = new IdleState();
    }

    public void setState(CoffeeMachineState newState) {
        this.currentState = newState;
    }

    public void performAction() {
        currentState.performAction();
    }
}

