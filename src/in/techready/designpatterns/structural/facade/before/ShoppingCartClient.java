package in.techready.designpatterns.structural.facade.before;

// Client Code without Facade
public class ShoppingCartClient {
    public static void main(String[] args) {
        InventorySystem inventorySystem = 
                                  new InventorySystem();
        OrderProcessingSystem orderProcessingSystem = 
                                  new OrderProcessingSystem();
        PaymentSystem paymentSystem = new PaymentSystem();

        // Complex logic involving Inventory, Order 
        // Processing, and Payment
        inventorySystem.updateInventory("Laptop", 2);
        orderProcessingSystem.placeOrder("Laptop", 2);
        paymentSystem.processPayment("Laptop", 2, 2000.0);
        // More complex logic...
    }
}

