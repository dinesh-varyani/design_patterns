package in.techready.designpatterns.structural.adapter.after;

// Target Interface expected by the American outlets
interface AmericanPlug {
    void plugInAmerica();
}

// European Plug
class EuropeanPlug {
    public void plugInEurope() {
        System.out.println("Plugged into European outlet");
        // Actual power connection logic for Europe
    }
}
// Adapter class implementing the AmericanPlug interface
class PlugAdapter implements AmericanPlug {
    private EuropeanPlug europeanPlug;

    public PlugAdapter(EuropeanPlug europeanPlug) {
        this.europeanPlug = europeanPlug;
    }

    @Override
    public void plugInAmerica() {
        // Convert European plug to fit American outlets
        System.out.println("Using an adapter to plug into American outlet");
        europeanPlug.plugInEurope();
    }
}

// Client using Adapter in America
public class Client {
    public static void main(String[] args) {
        EuropeanPlug europeanPlug = new EuropeanPlug();
        
        // Creating an adapter
        PlugAdapter adapter = new PlugAdapter(europeanPlug);
        
        // Using the adapter in America
        adapter.plugInAmerica();
    }
}

