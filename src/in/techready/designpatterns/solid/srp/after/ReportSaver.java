package in.techready.designpatterns.solid.srp.after;

class Report {
    private String content;

    public Report(String content) {
        this.content = content;
    }

    public void generateReport() {
        // Generate report logic here
        System.out.println("Generating report: " + content);
    }
}

public class ReportSaver {
    public void saveToFile(Report report, String fileName) {
        // Save to file logic here
        System.out.println("Saving report to file: " + 
                           fileName);
    }
}
