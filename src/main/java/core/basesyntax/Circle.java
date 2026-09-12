package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        super.area = this.getArea();
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
