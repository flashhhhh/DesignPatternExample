package Creational.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory(BRAND.GUCCI);
        factory = Factory.getFactory(BRAND.NIKE);
        Shoes shoes = factory.createShoes();
        Shirt shirt = factory.createShirt();
    }
}