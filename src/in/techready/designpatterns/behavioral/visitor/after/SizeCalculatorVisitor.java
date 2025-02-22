package in.techready.designpatterns.behavioral.visitor.after;

// Concrete visitor: SizeCalculatorVisitor
public class SizeCalculatorVisitor implements FileSystemVisitor {
    private int totalSize = 0;

    @Override
    public void visitFile(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visitDirectory(Directory directory) {
        for (FileSystemElement element : 
                                    directory.getElements()) {
            element.accept(this);
        }
    }

    // Getter for totalSize
    public int getTotalSize(){
        return totalSize;
    }
}