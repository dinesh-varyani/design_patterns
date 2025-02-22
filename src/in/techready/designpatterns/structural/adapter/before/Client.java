package in.techready.designpatterns.structural.adapter.before;

// European Plug
class EuropeanPlug {
    public void plugInEurope() {
        System.out.println("Plugged into European outlet");
        // Actual power connection logic for Europe
    }
}


// Client using European Plug in America
class Client {
    public static void main(String[] args) {
        EuropeanPlug europeanPlug = new EuropeanPlug();
        europeanPlug.plugInEurope();
        // The plug type is incompatible with American outlets
    }
}

