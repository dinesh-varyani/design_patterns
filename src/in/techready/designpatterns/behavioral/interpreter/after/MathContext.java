package in.techready.designpatterns.behavioral.interpreter.after;

// Context class that contains the mathematical expression and 
// interprets it.
public class MathContext {
    private MathExpression expression;

    public MathContext(MathExpression expression) {
        this.expression = expression;
    }

    public double interpret() {
        return expression.interpret();
    }
}