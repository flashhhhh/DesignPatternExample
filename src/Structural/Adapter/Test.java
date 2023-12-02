package Structural.Adapter;

public class Test {
    public static void main(String[] args) {
        DescartesCoordinatesSystem descartes = new DescartesPolarAdapter(new PolarCoordinatesSystem());
        descartes.point(1, 1);
    }
}