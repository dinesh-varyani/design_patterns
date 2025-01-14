interface DrawingStrategy {
    void draw();
}

class Circle implements DrawingStrategy {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements DrawingStrategy {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class Shape {
    private DrawingStrategy drawingStrategy;

    public Shape(DrawingStrategy drawingStrategy) {
        this.drawingStrategy = drawingStrategy;
    }

    public void draw() {
        drawingStrategy.draw();
    }
}
