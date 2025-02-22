package in.techready.designpatterns.behavioral.strategy.after;

// Concrete strategy: CreditCardPayment
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        // Implementation of credit card payment ...
        System.out.println("Processing credit card payment of $" + amount);
    }
}