package in.techready.designpatterns.creational.factorymethod.after;

// Report
public class Report implements Document {
    @Override
    public void generate() {
        System.out.println("Generating a report document.");
        // Report-specific logic
    }
}