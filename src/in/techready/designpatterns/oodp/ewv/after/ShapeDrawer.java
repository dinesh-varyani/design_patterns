package in.techready.designpatterns.oodp.ewv.after;

// OOD Principle - Encapsulate what varies
interface Shape {
    void draw();
}

class Circle implements Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        // Code to draw a circle
    }
}

class Rectangle implements Shape {
    private int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        // Code to draw a rectangle
    }
}

// ... other Shape implementations
public class ShapeDrawer {
    public void drawShape(Shape shape) {
        shape.draw();
    }
}
