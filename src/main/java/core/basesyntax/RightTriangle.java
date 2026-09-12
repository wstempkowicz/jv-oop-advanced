package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg = 0;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setColor(color);
        super.setName("right triangle");
        super.area = this.getArea();
    }

    public double getArea() {
        return this.firstLeg * this.secondLeg / 2;
    }

    public String draw() {
        return "Figure " + getName() + " pole: " + area
                + "sq. units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units color: " + getColor();
    }
}
