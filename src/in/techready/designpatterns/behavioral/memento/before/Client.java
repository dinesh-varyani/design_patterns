package in.techready.designpatterns.behavioral.memento.before;

// Client code without Memento pattern
public class Client {
    public static void main(String[] args) {
        Document document = new Document("Initial content");
        // Save the initial state (but we don't have a proper 
        // mechanism to restore it later)
        String initialState = document.getContent();
        // Make changes to the document
        document.setContent("Updated content");
        // Attempt to undo by restoring the initial state
        document.setContent(initialState); // This is a manual 
        // and error-prone way
        System.out.println("Current Content: " + 
                            document.getContent());
    }
}