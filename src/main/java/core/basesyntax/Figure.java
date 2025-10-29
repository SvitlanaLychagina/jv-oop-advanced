package core.basesyntax;

import java.util.Random;

public abstract class Figure implements Drawable, Area {
    protected String color;
    protected final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure() {
        color = colorSupplier.getRandomColor();
    }

    public Figure(String color) {
        this.color = color;
    }
}
