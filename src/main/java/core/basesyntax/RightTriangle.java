package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg = 0;
    private double secondLeg;
    private String name = "right triangle";
    private String color = "";
    private double area = 0;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
        this.area = this.getArea(firstLeg, secondLeg);
    }

    public double getArea(double firstLeg, double secondLeg) {
        double area = firstLeg * secondLeg / 2;
        return area;
    }
    
    public String draw() {
        return "Figure " + name + " pole: " + area 
            + "sq. units, firstLeg: " + firstLeg + " units, secondLeg: " 
            + secondLeg + " units color: " + color;
    } 
}
