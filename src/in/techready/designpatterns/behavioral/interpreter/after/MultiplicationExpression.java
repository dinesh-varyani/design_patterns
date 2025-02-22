package in.techready.designpatterns.behavioral.interpreter.after;

public class MultiplicationExpression implements MathExpression {
    private MathExpression left;
    private MathExpression right;

    public MultiplicationExpression(MathExpression left, 
                                    MathExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double interpret() {
        return left.interpret() * right.interpret();
    }
}