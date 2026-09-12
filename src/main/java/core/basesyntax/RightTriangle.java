package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg = 0;
    private double secondLeg;
    private double area = 0;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setColor(color);
        super.setName("right triangle");
        this.area = this.getArea(firstLeg, secondLeg);
    }

    public double getArea(double firstLeg, double secondLeg) {
        double area = firstLeg * secondLeg / 2;
        return area;
    }

    public String draw() {
        return "Figure " + getName() + " pole: " + area
                + "sq. units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units color: " + getColor();
    }
}
