package in.techready.designpatterns.behavioral.visitor.after;

import java.util.ArrayList;
import java.util.List;

// Client code
public class FileSystemProcessor {
    public static void main(String[] args) {
        // Code to process the file system using visitors
        List<FileSystemElement> fileSystemElements = new ArrayList<>();
        // Populate the fileSystemElements

        SizeCalculatorVisitor sizeCalculatorVisitor = 
                                  new SizeCalculatorVisitor();
        for (FileSystemElement element : fileSystemElements) {
            element.accept(sizeCalculatorVisitor);
        }

        int totalSize = sizeCalculatorVisitor.getTotalSize();
        System.out.println("Total Size: " + totalSize + " bytes");
    }
}