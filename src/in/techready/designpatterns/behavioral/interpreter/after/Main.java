package in.techready.designpatterns.behavioral.interpreter.after;

public class Main {
    public static void main(String[] args) {
        // Build a complex mathematical expression: 3 + 5 * 2
        MathExpression expression = new AdditionExpression(
          new NumberExpression(3), 
          new MultiplicationExpression(
          new NumberExpression(5), new NumberExpression (2)));
        MathContext context = new MathContext(expression);
        double result = context.interpret();
        System.out.println("Result: " + result);
    }
}