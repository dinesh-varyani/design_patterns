package in.techready.designpatterns.solid.lsp.before;

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

public class BirdExample {
    public static void performBirdActivity(Bird bird) {
        bird.fly();
    }
    // Current code adheres to LSP 
    public static void main(String[] args) {
        Bird genericBird = new Bird();
        Bird sparrow = new Sparrow();
        performBirdActivity(genericBird); // A bird can fly
        performBirdActivity(sparrow); // A sparrow is flying
    }
}
