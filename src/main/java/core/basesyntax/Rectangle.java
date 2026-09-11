package core.basesyntax;

public class Rectangle extends Figure {
    private int side1;
    private int side2;
    private String name = "square";
    private String color = "";
    private int area = 0;

    public Rectangle(int side1, int side2, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.color = color;
        this.area = this.area(side1, side2);
    }

    public int area(int side1, int side2) {
        int area = side2 * side1;
        return area;
    }   

    public String draw() {
        return "Figure " + name + " pole: " + area 
            + "sq. units, side1: " + side1 + " units, side2: " + side2 + " units color: " + color;
    } 
}
