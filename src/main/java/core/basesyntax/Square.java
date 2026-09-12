package core.basesyntax;

public class Square extends Figure {
    private double side;
    private String name = "square";
    private String color = "";
    private double area = 0;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
        this.area = this.getArea(side);
    }

    private double getArea(double side) {
        return side * side;
    }

    public String draw() {
        return "Figure " + this.name + " pole: " + this.area 
            + "sq. units, side: " + this.side + " units color: " + this.color;
    }   
}
