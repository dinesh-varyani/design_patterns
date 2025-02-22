package in.techready.designpatterns.behavioral.memento.after;

// Client code with Memento pattern
public class Client {
    public static void main(String[] args) {
        Document document = new Document("Initial content");
        DocumentHistory history = new DocumentHistory();

        // Save the initial state using Memento
        history.saveState(document.createMemento());

        // Make changes to the document
        document.setContent("Updated content");

        // Save the updated state
        history.saveState(document.createMemento());

        // Undo by restoring the initial state using Memento
        DocumentMemento initialState = history.undo();
        if (initialState != null) {
            document.restoreFromMemento(initialState);
        }

        System.out.println("Current Content: " + 
                            document.getContent());
    }
}