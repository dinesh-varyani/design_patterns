package in.techready.designpatterns.behavioral.state.before;

public class CoffeeMachine {
    private String state;

    public CoffeeMachine() {
        this.state = "idle";
    }

    public void performAction() {
        if ("idle".equals(state)) {
            System.out.println("Preparing coffee...");
            // Additional logic for preparing coffee in the 
            // 'idle' state
            state = "brewing";
        } else if ("brewing".equals(state)) {
            System.out.println("Cannot perform action while brewing.");
            // Additional logic for handling actions in the 
            // 'brewing' state
        } else if ("finished".equals(state)) {
            System.out.println("Coffee already prepared. Please reset.");
            // Additional logic for handling actions in the 
            // 'finished' state
        }
        // ... more states and actions
    }
}

