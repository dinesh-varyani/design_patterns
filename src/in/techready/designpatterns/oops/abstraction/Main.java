package in.techready.designpatterns.oops.abstraction;

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {

    @Override
    public double calculateArea() {
        // rectangle specific area calculation
        // internal to Rectangle class
        return 0;
    }
}

class Circle implements Shape {

    @Override
    public double calculateArea() {
        // circle specific area calculation
        // internal to Circle class
        return 0;
    }
}

class Triangle implements Shape {

    @Override
    public double calculateArea() {
        // triangle specific area calculation
        // internal to Triangle class
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
