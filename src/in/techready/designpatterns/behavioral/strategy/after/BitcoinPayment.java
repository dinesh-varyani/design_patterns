package in.techready.designpatterns.behavioral.strategy.after;

// Concrete strategy: BitcoinPayment
public class BitcoinPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
    }
}