package in.techready.designpatterns.structural.flyweight.before;

// Tree class without Flyweight pattern
public class Tree {
    private String type;
    private int x;
    private int y;

    public Tree(String type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Tree type: " + type + ", Position: (" + x + ", " + y + ")");
    }
}

