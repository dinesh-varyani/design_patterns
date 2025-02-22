package in.techready.designpatterns.behavioral.interpreter.after;

public class AdditionExpression implements MathExpression {
    private MathExpression left;
    private MathExpression right;

    public AdditionExpression(MathExpression left, 
                              MathExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double interpret() {
        return left.interpret() + right.interpret();
    }
}

