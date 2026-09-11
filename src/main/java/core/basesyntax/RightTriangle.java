package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg = 0;
    private int secondLeg;
    private String name = "right triangle";
    private String color = "";
    private double area = 0;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
        this.area = this.area(firstLeg, secondLeg);
    }

    public double area(int firstLeg, int secondLeg) {
        double area = firstLeg * secondLeg / 2;
        return area;
    }
    
    public String draw() {
        return "Figure " + name + " pole: " + area 
            + "sq. units, firstLeg: " + firstLeg + " units, secondLeg: " 
            + secondLeg + " units color: " + color;
    } 
}
