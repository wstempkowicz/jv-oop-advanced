package core.basesyntax;

public class Square extends Figure {
    private int side;
    private String name = "square";
    private String color = "";
    private int area = 0;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
        this.area = this.getArea(side);
    }

    private int getArea(int side) {
        return side * side;
    }

    public String draw() {
        return "Figure " + this.name + " pole: " + this.area 
            + "sq. units, side: " + this.side + " units color: " + this.color;
    }   
}
