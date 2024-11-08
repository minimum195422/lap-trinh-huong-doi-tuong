public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return 2 * PI * super.getRadius()
                + 2 * PI * super.getRadius() * super.getRadius();
    }

    @Override
    public String toString() {
        return "Cylinder[Circle[radius="
                + super.getRadius() + ",color="
                + super.getColor() + "],height=" + height + "]";
    }
}