package in.techready.designpatterns.solid.isp.after;

// Interface for entities that can work
public interface Workable {
    void work();
}

// Interface for entities that can eat
interface Eatable {
    void eat();
}

class Engineer implements Workable, Eatable {
    @Override
    public void work() {
        // Engineer-specific work logic
    }

    @Override
    public void eat() {
        // Engineer-specific eating logic
    }
}

class Robot implements Workable {
    @Override
    public void work() {
        // Robot-specific work logic
    }
}

