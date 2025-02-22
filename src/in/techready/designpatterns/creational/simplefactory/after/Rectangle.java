package in.techready.designpatterns.creational.simplefactory.after;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}