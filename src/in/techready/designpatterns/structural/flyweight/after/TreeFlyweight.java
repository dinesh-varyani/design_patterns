package in.techready.designpatterns.structural.flyweight.after;

// TreeFlyweight class representing the intrinsic state
public class TreeFlyweight {
    private String type;

    public TreeFlyweight(String type) {
        this.type = type;
    }

    public void display(int x, int y) {
        System.out.println("Tree type: " + type + ", Position: (" + x + ", " + y + ")");
    }
}