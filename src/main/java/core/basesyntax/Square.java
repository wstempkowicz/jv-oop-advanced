package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        super.setColor(color);
        super.setName("square");
        super.area = this.getArea();
    }

    public double getArea() {
        return this.side * this.side;
    }

    public String draw() {
        return "Figure " + getName() + " pole: " + this.area
                + "sq. units, side: " + this.side + " units color: " + getColor();
    }
}
