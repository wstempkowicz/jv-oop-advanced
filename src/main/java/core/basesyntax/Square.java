package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        super.color = color;
        super.name = "square";
    }

    public double getArea() {
        return side * side;
    }

    public void draw() {
        System.out.println("Figure " + getName() + " area: " + getArea() + " sq. units, side: " 
                + this.side + " units color: " + getColor());
    }
}
