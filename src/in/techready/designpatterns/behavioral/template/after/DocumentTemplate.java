package in.techready.designpatterns.behavioral.template.after;

public abstract class DocumentTemplate {
    public final void generateDocument() {
        generateHeader();
        generateBody();
        generateFooter();
    }

    protected abstract void generateHeader();
    protected abstract void generateBody();
    protected abstract void generateFooter();
}