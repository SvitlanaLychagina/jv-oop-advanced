package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private double side;

    public Square() {
        super();
        side = random.nextDouble(1.0, 50.0);
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: square, area: %.2f sq. units, side: %.2f units, color: %s",
                getArea(), side, super.color));
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
