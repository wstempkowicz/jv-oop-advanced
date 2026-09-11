package core.basesyntax;

public class MainApp {
     
    private static final int FIGURE_ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_ARRAY_LENGTH];

        for (int i = 0; i < FIGURE_ARRAY_LENGTH; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }  
    }
}
