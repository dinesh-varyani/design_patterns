package in.techready.designpatterns.structural.facade.after;

// Client Code with Facade
public class ShoppingCartClient {
    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade();

        // Client interacts with the subsystems through the 
        // facade
        shoppingFacade.purchaseProduct("Laptop", 2, 2000.0);

        // Client doesn't need to know about the details of 
        // Inventory, Order Processing, and Payment
    }
}