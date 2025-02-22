package in.techready.designpatterns.behavioral.memento.before;

// Document class without using Memento pattern
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
}

