package core.basesyntax;

public class Rectangle extends Figure {
    private double side1;
    private double side2;
    private double area = 0;

    public Rectangle(double side1, double side2, String color) {
        this.side1 = side1;
        this.side2 = side2;
        super.setColor(color);
        super.setName("rectangle");
        this.area = this.getArea(side1, side2);
    }

    public double getArea(double side1, double side2) {
        return side2 * side1;
    }

    public String draw() {
        return "Figure " + getName() + " pole: " + area
                + "sq. units, side1: " + side1 + " units, side2: "
                + side2 + " units color: " + getColor();
    }
}
