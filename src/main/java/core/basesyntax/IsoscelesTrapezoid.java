package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double side1;
    private double side2;
    private double sideh;
    private double area = 0;

    public IsoscelesTrapezoid(double side1, double side2, double sideh, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.sideh = sideh;
        super.setColor(color);
        super.setName("isosceles trapezoid");
        this.area = this.getArea(side1, side2, sideh);
    }

    public double getArea(double side1, double side2, double sideh) {
        return (side1 + side2) * sideh / 2;
    }

    public String draw() {
        return "Figure " + getName() + " pole: " + area
                + " sq. units, side1: " + side2 + " units, side2: " + side2 + " units, sideh: "
                + sideh + " units color: " + getColor();
    }
}
