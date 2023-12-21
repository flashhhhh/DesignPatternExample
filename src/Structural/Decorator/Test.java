package Structural.Decorator;

public class Test {
    public static void main(String[] args) {
        Pizza beefPizza = new BeefPizza();
        System.out.println(beefPizza.getName());

        PizzaDecorator pizzaDecorator = new TomatoPizzaDecorator(beefPizza);
        System.out.println(pizzaDecorator.getName());
    }
}