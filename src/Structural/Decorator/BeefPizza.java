package Structural.Decorator;

public class BeefPizza implements Pizza {
    private double radius = 10.0;
    public String getName() {
        return "Beef Pizza";
    }

    public double getRadius() {
        return radius;
    }
}