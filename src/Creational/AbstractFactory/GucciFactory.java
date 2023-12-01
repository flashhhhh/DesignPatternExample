package Creational.AbstractFactory;

public class GucciFactory extends Factory {
    private static GucciFactory instance = null;

    private GucciFactory() {}

    public static GucciFactory getInstance() {
        if (instance == null) {
            instance = new GucciFactory();
        }

        System.out.println("Welcome you to Gucci store!");
        return instance;
    }

    @Override
    public Shirt createShirt() {
        return new Shirt();
    }

    @Override
    public Shoes createShoes() {
        return new Shoes();
    }
}