package in.techready.designpatterns.creational.factorymethod.before;

// Client code
public class Client {
    public static void main(String[] args) {
        // Client code directly creates instances of Report
        Document report = new Report();
        report.generate();
        
        // Client code directly creates instances of Letter
        Document letter = new Letter();
        letter.generate();
    }
}

