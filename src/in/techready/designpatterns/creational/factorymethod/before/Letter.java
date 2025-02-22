package in.techready.designpatterns.creational.factorymethod.before;

// Letter
public class Letter implements Document {
    @Override
    public void generate() {
        System.out.println("Generating a letter document.");
        // Letter-specific logic
    }
}