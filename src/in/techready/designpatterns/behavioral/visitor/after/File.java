package in.techready.designpatterns.behavioral.visitor.after;

// Concrete element: File
public class File implements FileSystemElement {
    // Implementation for files
    private String name;
    private int size; // size in bytes

    @Override
    public String getName() {
        // Return file name
        return "";
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visitFile(this);
    }

    public int getSize() {
        return size;
    }
}