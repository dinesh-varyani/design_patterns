package in.techready.designpatterns.oops.inheritance;

class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

// the dog inherits makeSound() from Animal
class Dog extends Animal {
    // overrides makeSound() to provide dog specific sound
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// the cat inherits makeSound() from Animal
class Cat extends Animal {
    // overrides makeSound() to provide cat specific sound
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        Animal cat = new Cat();
        cat.makeSound();
    }
}
