package in.techready.designpatterns.creational.prototype.before;

public class Circle {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getters and setters...

    public Circle clone() {
        return new Circle(this.radius, this.color);
    }
}

