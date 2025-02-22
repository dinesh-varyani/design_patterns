package in.techready.designpatterns.behavioral.template.after;

public class Invoice extends DocumentTemplate {
    @Override
    protected void generateHeader() {
        System.out.println("Invoice Header");
    }

    @Override
    protected void generateBody() {
        System.out.println("Invoice Body");
    }

    @Override
    protected void generateFooter() {
        System.out.println("Invoice Footer");
    }
}

