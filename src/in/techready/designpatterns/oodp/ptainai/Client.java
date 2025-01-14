package in.techready.designpatterns.oodp.ptainai;

// OOD Principle - Program to an Interface, not an Implementation
interface Shape {
    double calculateArea(); 
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 3);
        printArea(circle); 
        printArea(rectangle);
    }

    private static void printArea(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
    }
}
