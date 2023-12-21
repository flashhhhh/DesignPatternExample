package Structural.Decorator;

public class CheesePizza implements Pizza {
    private double radius = 10.0;

    public String getName() {
        return "Cheese Pizza";
    }

    public double getRadius() {
        return radius;
    }
}