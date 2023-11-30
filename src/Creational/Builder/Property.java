package Creational.Builder;

// Your property must have name and money, the other properties are optional
public class Property {
    private final String name; // required
    private final int money; // required
    private int numMotorbikes;
    private int numCars;
    private int numVillas;
    private int numWatches;
    private int numDiamonds;

    // you don't want to construct a property like new Property("John", 1000000, 0, 0, 0, 0, 0)
    public Property(PropertyBuilder builder) {
        this.name = builder.name;
        this.money = builder.money;
        this.numMotorbikes = builder.numMotorbikes;
        this.numCars = builder.numCars;
        this.numVillas = builder.numVillas;
        this.numWatches = builder.numWatches;
        this.numDiamonds = builder.numDiamonds;
    }

    public String getInfo() {
        return "Name: " + name + "\n" +
                "Money: " + money + "\n" +
                "Motorbikes: " + numMotorbikes + "\n" +
                "Cars: " + numCars + "\n" +
                "Villas: " + numVillas + "\n" +
                "Watches: " + numWatches + "\n" +
                "Diamonds: " + numDiamonds + "\n";
    }

    // this class will help you to construct all of needed properties
    public static class PropertyBuilder {
        private final String name;
        private final int money;
        private int numMotorbikes;
        private int numCars;
        private int numVillas;
        private int numWatches;
        private int numDiamonds;

        public PropertyBuilder(String name, int money) {
            this.name = name;
            this.money = money;
        }

        public PropertyBuilder setNumMotorbikes(int numMotorbikes) {
            this.numMotorbikes = numMotorbikes;
            return this;
        }

        public PropertyBuilder setNumCars(int numCars) {
            this.numCars = numCars;
            return this;
        }

        public PropertyBuilder setNumVillas(int numVillas) {
            this.numVillas = numVillas;
            return this;
        }

        public PropertyBuilder setNumWatches(int numWatches) {
            this.numWatches = numWatches;
            return this;
        }

        public PropertyBuilder setNumDiamonds(int numDiamonds) {
            this.numDiamonds = numDiamonds;
            return this;
        }

        public Property build() {
            return new Property(this);
        }
    }
}