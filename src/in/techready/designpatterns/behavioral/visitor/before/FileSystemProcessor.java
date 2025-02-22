package in.techready.designpatterns.behavioral.visitor.before;

import java.util.ArrayList;
import java.util.List;

// Client code
public class FileSystemProcessor {
    public static int calculateTotalSize(List<FileSystemElement> elements) {
        int totalSize = 0;

        for (FileSystemElement element : elements) {
            if (element instanceof File) {
                totalSize += ((File) element).getSize();
            } else if (element instanceof Directory) {
                totalSize += calculateTotalSize(((Directory) 
                                 element).getElements());
            }
        }

        return totalSize;
    }

    public static void main(String[] args) {
        // Code to process the file system and calculate total 
        // size
        List fileSystemElements = new ArrayList<>();
        // Populate the fileSystemElements
        int totalSize=calculateTotalSize(fileSystemElements);
        System.out.println("Total Size: " + totalSize + " bytes");
    }
}