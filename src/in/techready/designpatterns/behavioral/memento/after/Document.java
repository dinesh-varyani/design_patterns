package in.techready.designpatterns.behavioral.memento.after;

// Originator class representing a document
public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // This method creates a snapshot (Memento) of the current      
    // state
    public DocumentMemento createMemento() {
        return new DocumentMemento(content);
    }

    // This method restores the state from a Memento
    public void restoreFromMemento(DocumentMemento memento) {
        this.content = memento.getContentSnapshot();
    }
}