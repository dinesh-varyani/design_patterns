package in.techready.designpatterns.behavioral.interpreter.before;

// Usage
public class Main {
    public static void main(String[] args) {
        SimpleMathEvaluator mathEvaluator = 
                                  new SimpleMathEvaluator();
        double result = mathEvaluator.evaluate("3 + 5 * 2");
        System.out.println("Result: " + result);
    }
}