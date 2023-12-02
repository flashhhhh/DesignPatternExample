package Structural.Bridge;

enum GadgetType {
    ANYWHERE_DOOR, TIME_MACHINE, TRANSLATION_JELLY, TAKE_COPTER, OBTAINING_BAG
}

public abstract class Gadget {
    public abstract String getGadget();
}