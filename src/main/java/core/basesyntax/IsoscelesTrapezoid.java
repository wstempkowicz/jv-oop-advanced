package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(double topBase, double bottomBase, double height, String color) {
        super("isosceles trapezoid", color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public double getArea() {
        return (topBase + bottomBase) * height / 2;
    }

    public void draw() {
        System.out.println("Figure " + getName() + " area: " + getArea()
                + " sq. units, topBase: " + topBase + " units, bottomBase: "
                + bottomBase + " units, height: "
                + height + " units color: " + getColor());
    }
}
