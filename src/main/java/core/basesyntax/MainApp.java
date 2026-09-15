package core.basesyntax;

public class MainApp {
     
    private static final int FIGURE_ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresRandom = new Figure[FIGURE_ARRAY_LENGTH/2];

        figuresDefault = figureSupplier.getDefaultFigure());

        for (int i = 0; i < FIGURE_ARRAY_LENGTH/2; i++) {
            figuresRandom[i] = figureSupplier.getRandomFigure();
        }

        Figure[] figures = ArrayUtils.addAll(figuresRandom, figuresDefault);
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }  
    }
}
