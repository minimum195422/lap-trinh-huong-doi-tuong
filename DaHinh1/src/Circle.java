public class Circle extends Shape {

    protected double radius;

    /**
     * Circle.
     */
    public Circle() {

        this.radius = 0;
    }


    /**
     * Circle.
     * @param radius  the radius.
     */
    public Circle(double radius) {

        super();
        this.radius = radius;
    }


    /**
     * Circle.
     * @param radius  the radius.
     * @param color  the color.
     * @param filled  the filled.
     */
    public Circle(double radius, String color, boolean filled) {

        super(color, filled);
        this.radius = radius;
    }


    /**
     * Gets the radius.
     * @return the radius.
     */
    public double getRadius() {

        return radius;
    }


    /**
     * Sets the radius.
     * @param radius  the radius.
     */
    public void setRadius(double radius) {

        this.radius = radius;
    }



    /**
     * Gets the area.
     * @return the area.
     */
    @Override
    public double getArea() {

        return Math.PI * Math.pow(this.radius, 2);
    }



    /**
     * Gets the perimeter.
     * @return the perimeter.
     */
    @Override
    public double getPerimeter() {

        return 2 * Math.PI * this.radius;
    }


    /**
     * To string.
     * @return String.
     */
    @Override
    public String toString() {

        return String.format(
                "Circle[radius=%.1f,color=%s,filled=%b]",
                this.radius,
                this.color,
                this.filled);
    }
}
