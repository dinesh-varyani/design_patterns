package in.techready.designpatterns.behavioral.visitor.after;

import java.util.List;

// Concrete element: Directory
public class Directory implements FileSystemElement {
    private String name;
    private List elements;
    // Implementation for directories

    @Override
    public String getName() {
        // Return directory name
        return "";
    }
    
    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visitDirectory(this);
    }

    public List<FileSystemElement> getElements() {
        return elements;
    }
}