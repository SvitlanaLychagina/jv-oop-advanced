package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figures figures = Figures.values()[random.nextInt(Figures.values().length)];
        switch (figures) {
            case CIRCLE:
                return new Circle();
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid();
            case RECTANGLE:
                return new Rectangle();
            case RIGHT_TRIANGLE:
                return new RightTriangle();
            case SQUARE:
                return new Square();
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
