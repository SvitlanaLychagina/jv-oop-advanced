package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private final Random random = new Random();
    private double radius;

    public Circle() {
        super();
        radius = random.nextDouble(1.0, 50.0);
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: circle, area: %.2f sq. units, radius: %.2f units, color: %s",
                getArea(), radius, super.color));
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
