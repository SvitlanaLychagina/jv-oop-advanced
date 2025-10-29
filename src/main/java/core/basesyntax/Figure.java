package core.basesyntax;

public abstract class Figure implements Drawable, Area {
    protected String color;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure() {
        color = colorSupplier.getRandomColor();
    }

    public Figure(String color) {
        this.color = color;
    }
}
