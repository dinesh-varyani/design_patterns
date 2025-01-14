package in.techready.designpatterns.solid.lsp.violation;

class Bird {
    public void fly() {
        System.out.println("A bird can fly");
    }
}

class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("A sparrow is flying");
    }
}

class Penguin extends Bird {
    // Penguins cannot fly, so override with 
    // UnsupportedOperationException
    @Override
    public void fly() {
        throw new UnsupportedOperationException(
                                      "Penguins cannot fly");
    }
}

public class BirdExample {
    public static void performBirdActivity(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        // Current code adheres to Liskov Substitution
        // Principle
        Bird genericBird = new Bird();
        Bird sparrow = new Sparrow();

        // Future change introduces a bird (Penguin) that
        // cannot fly
        Bird penguin = new Penguin();

        performBirdActivity(genericBird);  // A bird can fly
        performBirdActivity(sparrow); // A sparrow is flying
        performBirdActivity(penguin); // Potentially
        // violates Liskov Substitution Principle,
        // as it throws an UnsupportedOperationException
    }
}
