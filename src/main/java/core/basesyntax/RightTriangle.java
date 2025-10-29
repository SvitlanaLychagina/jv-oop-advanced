package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle() {
        super();
        firstLeg = random.nextDouble(1.0, 50.0);
        secondLeg = random.nextDouble(1.0, 50.0);
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: right triangle, area: %.2f sq. units, "
                        + "first leg: %.2f units, "
                        + "second leg: %.2f units, "
                        + "color: %s",
                getArea(), firstLeg, secondLeg, super.color));
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
