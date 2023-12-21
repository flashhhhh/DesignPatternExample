package Structural.Decorator;

public class TomatoPizzaDecorator extends PizzaDecorator {
    public TomatoPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return getPizza().getName() + addTomato();
    }

    public String addTomato() {
        return " + Tomato";
    }
}