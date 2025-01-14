package in.techready.designpatterns.solid.srp.before;

public class Report {
    private String content;

    public Report(String content) {
        this.content = content;
    }

    public void generateReport() {
        // Generate report logic here
        System.out.println("Generating report: " + content);
    }

    public void saveToFile(String fileName) {
        // Save to file logic here
        System.out.println("Saving report to file: " +      
                           fileName);
    }
}
