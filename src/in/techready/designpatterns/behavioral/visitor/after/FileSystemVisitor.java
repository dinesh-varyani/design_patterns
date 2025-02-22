package in.techready.designpatterns.behavioral.visitor.after;

// Visitor interface
public interface FileSystemVisitor {
    void visitFile(File file);
    void visitDirectory(Directory directory);
    // Add methods for new operations without modifying 
    // existing classes
}

