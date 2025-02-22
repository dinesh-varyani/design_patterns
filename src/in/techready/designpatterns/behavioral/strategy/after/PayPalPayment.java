package in.techready.designpatterns.behavioral.strategy.after;

// Concrete strategy: PayPalPayment
public class PayPalPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        // Implementation of PayPal payment
        // ...
        System.out.println("Processing PayPal payment of $" + amount);
    }
}