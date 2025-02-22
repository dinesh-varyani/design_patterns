package in.techready.designpatterns.behavioral.strategy.before;

// Client code
public class Client {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = 
                                       new PaymentProcessor();
        paymentProcessor.processPayment(100.0);
        // Continue with other operations
    }
}

