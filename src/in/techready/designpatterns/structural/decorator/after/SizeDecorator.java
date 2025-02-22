package in.techready.designpatterns.structural.decorator.after;

// Concrete Decorator - Size
public class SizeDecorator extends CoffeeDecorator {
    private String size;

    public SizeDecorator(Coffee decoratedCoffee, String size){
        super(decoratedCoffee);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " - " + size;
    }

    @Override
    public double getCost() {
        return super.getCost() + 
                 (size.equalsIgnoreCase("large") ? 1.5 : 0.0);
    }
}