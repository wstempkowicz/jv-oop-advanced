package core.basesyntax;

public class Circle extends Figure {
    private double radius = 0;
    private double area = 0;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.area = this.getArea();
        super.setName("circle");
        super.setColor(color);
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public String draw() {
        return "Figure " + getName() + " pole: " + area
                + "sq. units, side: " + radius + " units color: " + getColor();
    }
}
