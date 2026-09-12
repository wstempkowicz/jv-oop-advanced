package core.basesyntax;

public class Square extends Figure {
    private double side;
    private double area = 0;

    public Square(double side, String color) {
        this.side = side;
        super.setColor(color);
        super.setName("square");
        this.area = this.getArea(side);
    }

    private double getArea(double side) {
        return side * side;
    }

    public String draw() {
        return "Figure " + getName() + " pole: " + this.area
                + "sq. units, side: " + this.side + " units color: " + getColor();
    }
}
