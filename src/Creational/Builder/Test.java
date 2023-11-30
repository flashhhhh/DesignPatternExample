package Creational.Builder;

public class Test {
    public static void main(String[] args) {
        Property property = new Property.PropertyBuilder("John", 1000000)
                .setNumMotorbikes(2)
            .setNumCars(1)
            .setNumVillas(1)
            .setNumDiamonds(1)
            .build();

        System.out.println(property.getInfo());
    }
}