package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static final int FIGURE_COUNT = 5;
    public static final int RANDOM_LIMIT = 50;
    private FigureNames[] figureNames = FigureNames.values();
    private Random randomValueSupplier = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure[] getDefaultFigure() {
        Figure[] figure = {
                new Rectangle(10, 10, "white"),
                new RightTriangle(10, 10, "white"),
                new IsoscelesTrapezoid(10, 10, 10, "white"),
                new Circle(10, "white"),
                new Square(10, "white")
        };
        return figure;
    }

    public Figure getRandomFigure() {
        int sidea;
        int sideb;
        int value = randomValueSupplier.nextInt(FIGURE_COUNT);

        String figureName = figureNames[value].name().toLowerCase();
        switch (figureName) {
            case "circle":
                int radius = randomValueSupplier.nextInt(RANDOM_LIMIT);
                return new Circle(radius, color.getRandomColor());
            case "square":
                sidea = randomValueSupplier.nextInt(RANDOM_LIMIT);
                return new Square(sidea, color.getRandomColor());
            case "rectangle":
                sidea = randomValueSupplier.nextInt(RANDOM_LIMIT);
                sideb = randomValueSupplier.nextInt(RANDOM_LIMIT);
                Figure rectangle = new Rectangle(sidea, sideb, color.getRandomColor());
                return rectangle;
            case "right_triangle":
                int firstLeg = randomValueSupplier.nextInt(RANDOM_LIMIT);
                int secondLeg = randomValueSupplier.nextInt(RANDOM_LIMIT);
                Figure rightTriangle = new RightTriangle(firstLeg,
                        secondLeg,
                        color.getRandomColor());
                return rightTriangle;
            case "isosceles_trapezoid":
                double topBase = randomValueSupplier.nextInt(RANDOM_LIMIT);
                double bottomBase = randomValueSupplier.nextInt(RANDOM_LIMIT);
                double height = randomValueSupplier.nextInt(RANDOM_LIMIT);
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(topBase,
                        bottomBase,
                        height,
                        color.getRandomColor());
                return isoscelesTrapezoid;
            default:
                return new Circle(10, "white");
        }
    }
}
