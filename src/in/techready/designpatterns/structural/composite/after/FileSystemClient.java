package in.techready.designpatterns.structural.composite.after;

public class FileSystemClient {
    public static void main(String[] args) {
        // With Composite Pattern
        FileSystemComponent file3 = new File("file3.txt");
        FileSystemComponent file4 = new File("file4.txt");

        FileSystemComponent directory2 = 
                                    new Directory("Folder 2");
        ((Directory) directory2).addComponent(file3);
        ((Directory) directory2).addComponent(file4);

        directory2.display();
    }
}

