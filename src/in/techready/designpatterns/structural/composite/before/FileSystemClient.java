package in.techready.designpatterns.structural.composite.before;

public class FileSystemClient {
    public static void main(String[] args) {
        // Without Composite Pattern
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Directory directory1 = new Directory("Folder 1");
        directory1.addFile(file1);
        directory1.addFile(file2);

        directory1.display();
    }
}
