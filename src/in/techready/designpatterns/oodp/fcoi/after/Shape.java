
public class Shape {
    private DrawingStrategy drawingStrategy;

    public Shape(DrawingStrategy drawingStrategy) {
        this.drawingStrategy = drawingStrategy;
    }

    public void draw() {
        drawingStrategy.draw();
    }
}