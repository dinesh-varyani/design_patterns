package in.techready.designpatterns.creational.simplefactory.after;

public class Client { // Client Code
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape circle = shapeFactory.createShape("circle");
        circle.draw();
        Shape rectangle = 
                        shapeFactory.createShape("rectangle");
        rectangle.draw();
        Shape square = shapeFactory.createShape("square");
        square.draw();
    }
}

