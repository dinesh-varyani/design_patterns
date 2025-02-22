package in.techready.designpatterns.creational.prototype.before;

public class Rectangle {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Getters and setters...

    public Rectangle clone() {
        return new Rectangle(this.width, this.height, 
                             this.color);
    }
}