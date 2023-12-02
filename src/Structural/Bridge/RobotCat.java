package Structural.Bridge;

import java.util.ArrayList;
import java.util.List;

public class RobotCat {
    private String name;
    List<Donut> favoriteDonuts;
    List<Gadget> gadgetList;

    public RobotCat(String name) {
        this.name = name;
        favoriteDonuts = new ArrayList<>();
        gadgetList = new ArrayList<>();
    }

    public RobotCat(String name, List<Donut> favoriteDonuts, List<Gadget> gadgetList) {
        this.name = name;
        this.favoriteDonuts = favoriteDonuts;
        this.gadgetList = gadgetList;
    }

    public void addDonut(DonutType donutName) {
        switch (donutName) {
            case RED_BEAN -> favoriteDonuts.add(new RedBean());
            case GREEN_BEAN -> favoriteDonuts.add(new GreenBean());
            case SWEET -> favoriteDonuts.add(new Sweet());
            case SPICY -> favoriteDonuts.add(new Spicy());
            case NO_INGREDIENT -> favoriteDonuts.add(new NoIngredient());
            default -> throw new IllegalArgumentException("Invalid donut type: " + donutName);
        }
    }

    public void addGadget(GadgetType gadgetName) {
        switch (gadgetName) {
            case ANYWHERE_DOOR -> gadgetList.add(new AnywhereDoor());
            case TIME_MACHINE -> gadgetList.add(new TimeMachine());
            case TRANSLATION_JELLY -> gadgetList.add(new TranslationJelly());
            case TAKE_COPTER -> gadgetList.add(new TakeCopter());
            case OBTAINING_BAG -> gadgetList.add(new ObtainingBag());
            default -> throw new IllegalArgumentException("Invalid gadget type: " + gadgetName);
        }
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("RobotCat: ").append(name).append("\n");
        sb.append("Favorite donuts: ").append("\n");
        for (Donut donut : favoriteDonuts) {
            sb.append(donut.getType()).append("\n");
        }
        sb.append("Gadgets: ").append("\n");
        for (Gadget gadget : gadgetList) {
            sb.append(gadget.getGadget()).append("\n");
        }
        return sb.toString();
    }
}