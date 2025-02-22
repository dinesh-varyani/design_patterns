package in.techready.designpatterns.behavioral.visitor.after;

// Element interface
public interface FileSystemElement {
    String getName();
    void accept(FileSystemVisitor visitor);
}