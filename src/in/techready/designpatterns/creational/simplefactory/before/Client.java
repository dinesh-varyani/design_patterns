package in.techready.designpatterns.creational.simplefactory.before;

// Client Code
public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        
        Shape rectangle = new Rectangle();
        rectangle.draw();
        
        Shape square = new Square();
        square.draw();
    }
}