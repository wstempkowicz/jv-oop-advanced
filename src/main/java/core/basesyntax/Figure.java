package core.basesyntax;

public abstract class Figure {
    protected String name;
    protected String color;
    protected double area;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String draw();

    public abstract double getArea();

}
