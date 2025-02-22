package in.techready.designpatterns.behavioral.template.before;

public class Invoice {
    public void generateInvoice() {
        generateHeader();
        generateBody();
        generateFooter();
    }

    private void generateHeader() {
        System.out.println("Invoice Header");
    }

    private void generateBody() {
        System.out.println("Invoice Body");
    }

    private void generateFooter() {
        System.out.println("Invoice Footer");
    }
}