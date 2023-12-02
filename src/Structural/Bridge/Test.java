package Structural.Bridge;

public class Test {
    public static void main(String[] args) {
        RobotCat doraemon = new RobotCat("Doraemon");
        doraemon.addDonut(DonutType.NO_INGREDIENT);
        doraemon.addGadget(GadgetType.ANYWHERE_DOOR);

        System.out.println(doraemon.display());

        RobotCat dora_the_kid = new RobotCat("Dora-the-kid");
        dora_the_kid.addDonut(DonutType.RED_BEAN);
        dora_the_kid.addGadget(GadgetType.TIME_MACHINE);

        System.out.println(dora_the_kid.display());
    }
}