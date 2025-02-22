package in.techready.designpatterns.structural.composite.before;

// Individual File
public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("File: " + name);
    }
}