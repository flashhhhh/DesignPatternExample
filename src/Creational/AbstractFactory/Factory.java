package Creational.AbstractFactory;

enum BRAND {
    GUCCI, NIKE
}

public abstract class Factory {
    public abstract Shirt createShirt();
    public abstract Shoes createShoes();

    public static Factory getFactory(BRAND brand) {
        switch (brand) {
            case GUCCI:
                return GucciFactory.getInstance();
            case NIKE:
                return NikeFactory.getInstance();
            default:
                throw new IllegalArgumentException("This brand isn't exist!");
        }
    }
}