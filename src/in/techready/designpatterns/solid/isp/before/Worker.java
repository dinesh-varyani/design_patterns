package in.techready.designpatterns.solid.isp.before;

public interface Worker {
    void work();
    void eat();
}

class Engineer implements Worker {
    @Override
    public void work() {
        // Engineer-specific work logic
    }

    @Override
    public void eat() {
        // Engineer-specific eating logic
    }
}

class Robot implements Worker {
    @Override
    public void work() {
        // Robot-specific work logic
    }

    @Override
    public void eat() {
        // This is irrelevant for a robot
    }
}


