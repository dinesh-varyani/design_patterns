package in.techready.designpatterns.structural.composite.after;

import java.util.ArrayList;
import java.util.List;

// Composite (Directory)
public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new 
                                                ArrayList<>();
    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.display();
        }
    }
}