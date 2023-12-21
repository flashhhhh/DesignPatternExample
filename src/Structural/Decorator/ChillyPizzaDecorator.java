package Structural.Decorator;

public class ChillyPizzaDecorator extends PizzaDecorator {
    public ChillyPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return getPizza().getName() + addChilly();
    }

    public String addChilly() {
        return " + Chilly";
    }
}