package in.techready.designpatterns.behavioral.strategy.before;

// Payment processing class with a specific payment method
public class PaymentProcessor {
    public void processPayment(double amount) {
        // Specific implementation for credit card payments
        System.out.println("Processing credit card payment of $" + amount);
    }
}