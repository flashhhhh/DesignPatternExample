package Creational.AbstractFactory;

public class NikeFactory extends Factory {
    private static NikeFactory instance = null;

    private NikeFactory() {}

    public static NikeFactory getInstance() {
        if (instance == null) {
            instance = new NikeFactory();
        }

        System.out.println("Welcome you to Nike store!");
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