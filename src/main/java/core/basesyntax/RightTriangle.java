package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg = 0;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.color = color;
        super.name = "right triangle";
    }

    public double getArea() {
        return this.firstLeg * this.secondLeg / 2;
    }

    public void draw() {
        System.out.println("Figure " + getName() + " area: " 
                        + getArea() + "Figure " + getName() + " area: " + getArea()
                        + "sq. units, firstLeg: " + firstLeg + " units, secondLeg: "
                        + secondLeg + " units color: " + getColor());
    }
}
