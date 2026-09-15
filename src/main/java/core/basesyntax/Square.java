package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(int side, String color) {
        this.side = side;
        super("square", colosquarer);
    }

    @override
    public int getArea() {
        return side * side;
    }

    public void draw() {
        System.out.println("Figure " + getName() + " area: " + getArea() + " sq. units, side: "
                + this.side + " units color: " + getColor());
    }
}
