package Structural.Adapter;

public class DescartesPolarAdapter implements DescartesCoordinatesSystem {
    private PolarCoordinatesSystem polar;

    public DescartesPolarAdapter(PolarCoordinatesSystem polar) {
        this.polar = polar;
    }

    @Override
    public void point(double x, double y) {
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);
        polar.point(r, theta);
    }
}