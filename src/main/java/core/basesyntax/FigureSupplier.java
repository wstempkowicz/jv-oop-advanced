package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static final int FIGURE_COUNT = 5;
    public static final int RANDOM_LIMIT = 50;
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = "white";

    private Random randomValueSupplier = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        int figureIndex = randomValueSupplier.nextInt(FIGURE_COUNT);
        String figureName = FigureNames.values()[figureIndex].toString();
        switch (figureName) {
            case "CIRCLE":
                int radius = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                return new Circle(radius, color.getRandomColor());
            case "SQUARE":
                int sideA = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                return new Square(sideA, color.getRandomColor());
            case "RECTANGLE":
                sideA = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                int sideB = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                Figure rectangle = new Rectangle(sideA, sideB, color.getRandomColor());
                return rectangle;
            case "RIGHT_TRIANGLE":
                int firstLeg = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                int secondLeg = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                Figure rightTriangle = new RightTriangle(firstLeg,
                        secondLeg,
                        color.getRandomColor());
                return rightTriangle;
            default:
            case "ISOSCELES_TRAPEZOID":
                double topBase = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                double bottomBase = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                double height = randomValueSupplier.nextInt(RANDOM_LIMIT) + 1;
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(topBase,
                        bottomBase,
                        height,
                        color.getRandomColor());
                return isoscelesTrapezoid;
        }
    }
}
