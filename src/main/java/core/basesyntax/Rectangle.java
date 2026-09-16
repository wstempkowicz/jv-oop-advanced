package core.basesyntax;

public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2, String color) {
        super("rectangle", color);
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getArea() {
        return side2 * side1;
    }

    public void draw() {
        System.out.println("Figure " + getName() + " area: " + getArea()
                + "sq. units, side1: " + side1 + " units, side2: "
                + side2 + " units color: " + getColor());
    }
}
