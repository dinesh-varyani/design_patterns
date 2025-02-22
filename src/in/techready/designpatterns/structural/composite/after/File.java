package in.techready.designpatterns.structural.composite.after;

// Leaf (Individual File)
public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("File: " + name);
    }
}