package in.techready.designpatterns.creational.factorymethod.after;

// DocumentCreator abstract class (Factory Method)
public abstract class DocumentCreator {
    public abstract Document createDocument();

    // New method to process the document
    public void generateDocument() {
        Document document = createDocument();
        // addtional custom logic
        document.generate();
    }
}