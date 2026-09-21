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
        String figureName = FigureNames.values()[figureIndex].name();
        String color = colorSupplier.getRandomColor();
        switch (figureName) {
            case "CIRCLE":
                int radius = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                return new Circle(radius, color);
            case "SQUARE":
                int sideAB = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                return new Square(sideAB, color);
            case "RECTANGLE":
                int sideA = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                int sideB = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                return new Rectangle(sideA, sideB, color);
            case "RIGHT_TRIANGLE":
                int firstLeg = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                int secondLeg = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                return new RightTriangle(firstLeg,
                        secondLeg,
                        color);
            default:
            case "ISOSCELES_TRAPEZOID":
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
