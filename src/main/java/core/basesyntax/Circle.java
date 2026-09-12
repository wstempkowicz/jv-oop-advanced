package core.basesyntax;

public class Circle extends Figure {
    private double radius = 0;
    private double area = 0; 

    public Circle(double radius, String color) {
        this.radius = radius;
        this.area = this.getArea(radius);
        super.setName("circle");
        super.setColor(color);
    }
    
    public double getArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public String draw() {
        return "Figure " + getName() + " pole: " + area 
            + "sq. units, side: " + radius + " units color: " + getColor();
    }   
}
