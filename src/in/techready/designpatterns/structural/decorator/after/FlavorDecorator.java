package in.techready.designpatterns.structural.decorator.after;

// Another Concrete Decorator - Flavor
public class FlavorDecorator extends CoffeeDecorator {
    private String flavor;

    public FlavorDecorator(Coffee decoratedCoffee, String 
                           flavor) {
        super(decoratedCoffee);
        this.flavor = flavor;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with " + flavor + " flavor";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75;
    }
}