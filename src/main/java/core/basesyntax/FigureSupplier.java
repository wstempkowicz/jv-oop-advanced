package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private FigureNames[] figureNames = FigureNames.values();
    private Random randomValueSupplier = new Random();
    private Figure randomFigure = null;

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
        int a;
        int b;
        int value = randomValueSupplier.nextInt(figureNames.length);
        ColorSupplier color = new ColorSupplier();
        String figureName = figureNames[value].name().toLowerCase();
        switch (figureName) {
            case "circle":
                int radius = randomValueSupplier.nextInt(100);
                return new Circle(radius, color.getRandomColor());
            case "square":
                a = randomValueSupplier.nextInt(100);
                return new Square(a, color.getRandomColor());
            case "rectangle":
                a = randomValueSupplier.nextInt(100);
                b = randomValueSupplier.nextInt(100);
                Figure rectangle = new Rectangle(a, b, color.getRandomColor());
                return rectangle;
            case "right_triangle":
                a = randomValueSupplier.nextInt(100);
                b = randomValueSupplier.nextInt(100);
                Figure rightTriangle = new RightTriangle(a, b, color.getRandomColor());
                return rightTriangle;
            case "isosceles_trapezoid":
                a = randomValueSupplier.nextInt(10);
                b = randomValueSupplier.nextInt(10);
                int h = randomValueSupplier.nextInt(10);
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(a, b, h, color.getRandomColor());
                return isoscelesTrapezoid;
            default:
                return randomFigure;
        }

    }
}
