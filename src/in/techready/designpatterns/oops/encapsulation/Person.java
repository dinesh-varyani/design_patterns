package in.techready.designpatterns.oops.encapsulation;

public class Person {
    // private variables protected from direct access
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // age variable is private and gets mutated via validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }
}
