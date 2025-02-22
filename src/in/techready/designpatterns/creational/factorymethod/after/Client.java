package in.techready.designpatterns.creational.factorymethod.after;

// Client code
public class Client {
    public static void main(String[] args) {
        // Existing document types
        DocumentCreator reportCreator = new ReportCreator();
        reportCreator.generateDocument();

        DocumentCreator letterCreator = new LetterCreator();
        letterCreator.generateDocument();
        // Existing client code with no modifications 
        // for the existing document types
    }
}

