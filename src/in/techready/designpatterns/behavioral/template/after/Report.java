package in.techready.designpatterns.behavioral.template.after;

public class Report extends DocumentTemplate {
    @Override
    protected void generateHeader() {
        System.out.println("Report Header");
    }

    @Override
    protected void generateBody() {
        System.out.println("Report Body");
    }

    @Override
    protected void generateFooter() {
        System.out.println("Report Footer");
    }
}