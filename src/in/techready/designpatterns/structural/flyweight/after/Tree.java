package in.techready.designpatterns.structural.flyweight.after;

// Tree class using Flyweight pattern
public class Tree {
    private TreeFlyweight treeType;
    private int x;
    private int y;

    public Tree(String type, int x, int y) {
        this.treeType = TreeFactory.getTreeFlyweight(type);
        this.x = x;
        this.y = y;
    }

    public void display() {
        treeType.display(x, y);
    }
}

