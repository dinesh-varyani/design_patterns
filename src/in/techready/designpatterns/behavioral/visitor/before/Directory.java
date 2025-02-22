package in.techready.designpatterns.behavioral.visitor.before;

import java.util.List;

// Concrete element: Directory
public class Directory implements FileSystemElement {
    private String name;
    private List elements;

    // Constructor, getters, and other methods

    @Override
    public String getName() {
        return name;
    }


    public List getElements() {
        return elements;
    }
}

