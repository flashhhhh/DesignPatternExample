package Structural.Bridge;

enum DonutType {
    RED_BEAN, GREEN_BEAN, SWEET, SPICY, NO_INGREDIENT
}

public abstract class Donut {
    public abstract String getType();
}