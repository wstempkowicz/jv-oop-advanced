package core.basesyntax;

public class Circle extends Figure {
    private int radius = 0;
    private String name = "circle";
    private String color = "white";
    private double area = 0; 

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
        this.area = this.getArea(radius);
    }
    
    public double getArea(int radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public String draw() {
        return "Figure " + name + " pole: " + area 
            + "sq. units, side: " + radius + " units color: " + color;
    }   
}
