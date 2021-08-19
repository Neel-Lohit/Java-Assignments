package Circle;

public class Circle {
    private double radius;
    public Circle()
    {
        this(1.0);
    }
    public Circle(double radius)
    {
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getCircumference()
    {
        return 2 * Math.PI* radius;
    }
    public double getArea()
    {
        return 2* Math.PI * radius * radius;
    }
}
