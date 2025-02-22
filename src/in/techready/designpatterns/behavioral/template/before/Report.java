package in.techready.designpatterns.behavioral.template.before;

public class Report {
    public void generateReport() {
        generateHeader();
        generateBody();
        generateFooter();
    }

    private void generateHeader() {
        System.out.println("Report Header");
    }

    private void generateBody() {
        System.out.println("Report Body");
    }

    private void generateFooter() {
        System.out.println("Report Footer");
    }
}

