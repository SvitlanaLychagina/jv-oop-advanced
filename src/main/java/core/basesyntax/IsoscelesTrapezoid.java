package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private double bottomBase;
    private double topBase;
    private double height;

    public IsoscelesTrapezoid() {
        super();
        bottomBase = random.nextDouble(1.0, 50.0);
        topBase = random.nextDouble(1.0, 50.0);
        height = random.nextDouble(1.0, 30.0);
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: isosceles trapezoid, area: %.2f sq. units, "
                        + "bottom base: %.2f units, "
                        + "top base: %.2f units, "
                        + "height: %.2f units, "
                        + "color: %s",
                getArea(), bottomBase, topBase, height, super.color));
    }

    @Override
    public double getArea() {
        return ((bottomBase + topBase) * height) / 2;
    }
}
