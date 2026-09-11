package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side1;
    private int side2;
    private int sideh;
    private String name = "isosceles trapezoid";
    private String color = "";
    private double area = 0;

    public IsoscelesTrapezoid(int side1, int side2, int sideh, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.sideh = sideh;
        this.color = color;
        this.area = this.area(side1, side2, sideh);
    }

    public double area(int side1, int side2, int sideh) {
        return (side1 + side2) * sideh / 2;
    }

    public String draw() {
        return "Figure " + name + " pole: " + area 
            + " sq. units, side1: " + side2 + " units, side2: " + side2 + " units, sideh: "
            + sideh + " units color: " + color;
    } 
}
