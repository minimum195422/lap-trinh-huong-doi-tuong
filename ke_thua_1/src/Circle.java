public class Circle {
    private double radius;
    private String color;
    protected static final double PI = Math.PI;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return PI * radius / 2;
    }

    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
