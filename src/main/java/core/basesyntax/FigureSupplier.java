package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = FigureNames.values().length;
    public static final int RANDOM_LIMIT = 50;
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = "white";

    private Random randomValueSupplier = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        int figureIndex = randomValueSupplier.nextInt(FIGURE_COUNT);
        FigureNames figureName = FigureNames.values()[figureIndex];
        String color = colorSupplier.getRandomColor();
        if (figureName == FigureNames.CIRCLE) {
            int radius = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
            return new Circle(radius, color);
        } else if (figureName == FigureNames.SQUARE) {
            int side = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
            return new Square(side, color);
        } else if (figureName == FigureNames.RECTANGLE) {
            int sideA = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
            int sideB = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
            return new Rectangle(sideA, sideB, color);
        } else if (figureName == FigureNames.RIGHT_TRIANGLE) {
            int firstLeg = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
            int secondLeg = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
            return new RightTriangle(firstLeg,
                    secondLeg,
                    color);
        } else {
            double topBase = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
            double bottomBase = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
            double height = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
            return new IsoscelesTrapezoid(topBase,
                    bottomBase,
                    height,
                    color);
        }
    }
}
