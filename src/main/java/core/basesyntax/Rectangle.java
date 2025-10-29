package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle() {
        super();
        firstSide = random.nextDouble(1.0, 50.0);
        secondSide = random.nextDouble(1.0, 50.0);
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: rectangle, area: %.2f sq. units, "
                        + "first side: %.2f units, "
                        + "second side: %.2f units, "
                        + "color: %s",
                getArea(), firstSide, secondSide, super.color));
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
