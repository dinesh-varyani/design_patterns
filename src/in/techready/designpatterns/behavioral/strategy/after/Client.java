package in.techready.designpatterns.behavioral.strategy.after;

// Client code
public class Client {
    public static void main(String[] args) {
        // Using CreditCardPayment strategy
        PaymentProcessor paymentProcessor = 
             new PaymentProcessor(new CreditCardPayment());
        paymentProcessor.processPayment(100.0);

        // Switching to PayPalPayment strategy dynamically
        paymentProcessor.setPaymentStrategy(
                               new PayPalPayment());
        paymentProcessor.processPayment(50.0);

        // Switching to BitcoinPayment strategy dynamically
        paymentProcessor.setPaymentStrategy(
                               new BitcoinPayment());
        paymentProcessor.processPayment(200.0);

        // Continue with other operations
    }
}