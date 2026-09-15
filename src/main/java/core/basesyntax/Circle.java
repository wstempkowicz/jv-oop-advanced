package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        super("circle", color);
    }

    @override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Figure " + getName() + " area: " + getArea()
                + "sq. units, radius: " + radius + " units color: " + getColor());
    }
}
