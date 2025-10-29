package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i >= 3) {
                figureSupplier.getDefaultFigure().draw();
            } else {
                figureSupplier.getRandomFigure().draw();
            }
        }
    }
}
