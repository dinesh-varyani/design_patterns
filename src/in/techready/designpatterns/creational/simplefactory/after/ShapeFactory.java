package in.techready.designpatterns.creational.simplefactory.after;

public class ShapeFactory { // Simple Factory
    public Shape createShape(String shapeType) {
        if ("circle".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if ("square".equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        
        throw new IllegalArgumentException("Invalid shape type: " + shapeType);
    }
}