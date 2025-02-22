package in.techready.designpatterns.creational.prototype.after;

public class Circle implements Shape {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius, this.color);
    }
}

