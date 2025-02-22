package in.techready.designpatterns.behavioral.memento.after;

// Memento class representing a snapshot of the document state
public class DocumentMemento {
    private final String contentSnapshot;

    public DocumentMemento(String content) {
        this.contentSnapshot = content;
    } 
    
    public String getContentSnapshot() {
        return contentSnapshot;
    }
}

