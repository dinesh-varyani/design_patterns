package in.techready.designpatterns.behavioral.visitor.before;

// Concrete element: File
public class File implements FileSystemElement {
    private String name;
    private int size; // size in bytes

    // Constructor, getters, and other methods

    @Override
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}