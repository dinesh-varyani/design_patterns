package in.techready.designpatterns.creational.factorymethod.after;

// LetterCreator
public class LetterCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new Letter();
    }
}