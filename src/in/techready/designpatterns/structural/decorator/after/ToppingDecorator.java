package in.techready.designpatterns.structural.decorator.after;

// Another Concrete Decorator - Topping
public class ToppingDecorator extends CoffeeDecorator {
    private String topping;

    public ToppingDecorator(Coffee decoratedCoffee, String 
                            topping) {
        super(decoratedCoffee);
        this.topping = topping;
    }


    @Override
    public String getDescription() {
        return super.getDescription() + " with " + topping + " topping";
    }
    
    @Override
    public double getCost() {
        return super.getCost() + 1.0;
    }
}