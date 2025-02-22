package in.techready.designpatterns.creational.factorymethod.after;

// ReportCreator
public class ReportCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new Report();
    }
}