package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double side1;
    private double side2;
    private double sideh;

    public IsoscelesTrapezoid(double side1, double side2, double sideh, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.sideh = sideh;
        super.color = color;
        super.name = "isosceles trapezoid";
    }

    public double getArea() {
        return (side1 + side2) * sideh / 2;
    }

    public void draw() {
        System.out.println("Figure " + getName() + " area: " + getArea()
                + " sq. units, side1: " + side2 + " units, side2: " + side2 + " units, sideh: "
                + sideh + " units color: " + getColor());
    }
}
