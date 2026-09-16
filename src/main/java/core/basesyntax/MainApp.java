package core.basesyntax;

public class MainApp {

    private static final int FIGURE_ARRAY_LENGTH = 10;
    private static final int FIGURE_COUNT = 5;

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_ARRAY_LENGTH];

        Figure[] figuresDefault = figureSupplier.getDefaultFigure();

        Figure[] figuresRandom = new Figure[5];
        for (int i = 0; i < FIGURE_COUNT; i++) {
            figuresRandom[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 0; i < FIGURE_ARRAY_LENGTH; i++) {
            if (i < FIGURE_COUNT) {
                figures[i] = figuresDefault[i];
            } else {
                figures[i] = figuresRandom[i - FIGURE_COUNT];
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
