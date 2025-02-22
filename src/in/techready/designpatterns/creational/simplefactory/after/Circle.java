package in.techready.designpatterns.creational.simplefactory.after;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}