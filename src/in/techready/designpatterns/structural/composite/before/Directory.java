package in.techready.designpatterns.structural.composite.before;

import java.util.ArrayList;
import java.util.List;

// Directory
public class Directory {
    private String name;
    private List<File> files = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void display() {
        System.out.println("Directory: " + name);
        for (File file : files) {
            file.display();
        }
    }
}
