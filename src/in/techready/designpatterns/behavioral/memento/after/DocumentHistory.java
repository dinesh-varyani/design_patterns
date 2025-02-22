package in.techready.designpatterns.behavioral.memento.after;

import java.util.Stack;

// Caretaker class responsible for managing multiple states of 
// the document
public class DocumentHistory {
    private Stack<DocumentMemento> history = new Stack<>();

    public void saveState(DocumentMemento memento) {
        history.push(memento);
    }

    public DocumentMemento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}