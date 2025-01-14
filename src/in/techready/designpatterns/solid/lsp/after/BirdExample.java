package in.techready.designpatterns.solid.lsp.after;

interface Flyable {
    void fly();
}

class Bird {
   // Bird class does not implement Flyable interface directly
}

class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("A sparrow is flying");
    }
}

class Penguin extends Bird {
  // Penguins cannot fly, so no need to override or implement 
  // fly method
}

public class BirdExample {
    public static void performBirdActivity(Flyable bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        // Adhering to Liskov Substitution Principle with 
        // Flyable interface
        Flyable sparrow = new Sparrow();
        performBirdActivity(sparrow);
        // Compilation error: Penguin does not implement 
        // Flyable
        // Flyable penguin = new Penguin();
    }
}
