package in.techready.designpatterns.solid.ocp.before;

public class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double calculateArea() {
        if (type.equals("Rectangle")) {
            // Calculate rectangle area
            return 0.0;
        } else if (type.equals("Circle")) {
            // Calculate circle area
            return 0.0;
        } else {
            return 0.0; // Default case
        }
    }
}
