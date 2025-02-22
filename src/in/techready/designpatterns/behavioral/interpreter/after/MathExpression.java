package in.techready.designpatterns.behavioral.interpreter.after;

// Now, let's use the Interpreter Design Pattern to create a 
// more modular and extensible math evaluator.
// Abstract expression interface representing a mathematical 
// expression.
public interface MathExpression {
    double interpret();
}