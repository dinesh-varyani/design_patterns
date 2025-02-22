package in.techready.designpatterns.structural.facade.after;

// Facade Class
public class ShoppingFacade {
    private InventorySystem inventorySystem;
    private OrderProcessingSystem orderProcessingSystem;
    private PaymentSystem paymentSystem;

    public ShoppingFacade() {
        this.inventorySystem = new InventorySystem();
        this.orderProcessingSystem = 
                                  new OrderProcessingSystem();
        this.paymentSystem = new PaymentSystem();
    }

    // Simplified methods for the client
    public void purchaseProduct(String product, int quantity, 
                                double amount) {
        inventorySystem.updateInventory(product, quantity);
        orderProcessingSystem.placeOrder(product, quantity);
        paymentSystem.processPayment(product, quantity, 
                                     amount);
    }
    // Additional simplified methods if needed
}

