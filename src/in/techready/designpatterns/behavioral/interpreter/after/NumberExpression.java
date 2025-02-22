package in.techready.designpatterns.behavioral.interpreter.after;

// Concrete classes for different mathematical operations.
public class NumberExpression implements MathExpression {
    private double value;

    public NumberExpression(double value) {
        this.value = value;
    }

    @Override
    public double interpret() {
        return value;
    }
}