package core.basesyntax;

public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2, String color) {
        this.side1 = side1;
        this.side2 = side2;
        super.setColor(color);
        super.setName("rectangle");
        super.area = this.getArea();
    }

    public double getArea() {
        return this.side2 * this.side1;
    }

    public String draw() {
        return "Figure " + getName() + " pole: " + area
                + "sq. units, side1: " + side1 + " units, side2: "
                + side2 + " units color: " + getColor();
    }
}
