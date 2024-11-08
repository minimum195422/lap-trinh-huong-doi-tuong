public class Rectangle extends Shape {

    protected double width;

    protected double length;

    /**
     * Rectangle.
     */
    public Rectangle() {

        super();
        this.width = 0;
        this.length = 0;
    }


    /**
     * Rectangle.
     * @param width  the width.
     * @param length  the length.
     */
    public Rectangle(double width, double length) {

        super();
        this.width = width;
        this.length = length;
    }


    /**
     * Rectangle.
     * @param width  the width.
     * @param length  the length.
     * @param color  the color.
     * @param filled  the filled.
     */
    public Rectangle(double width, double length, String color, boolean filled) {

        super(color, filled);
        this.width = width;
        this.length = length;
    }


    /**
     * Gets the width.
     * @return the width.
     */
    public double getWidth() {

        return width;
    }


    /**
     * Sets the width.
     * @param width  the width.
     */
    public void setWidth(double width) {

        this.width = width;
    }


    /**
     * Gets the length.
     * @return the length.
     */
    public double getLength() {

        return length;
    }


    /**
     * Sets the length.
     * @param length  the length.
     */
    public void setLength(double length) {

        this.length = length;
    }



    /**
     * Gets the area.
     * @return the area.
     */
    @Override
    public double getArea() {

        return this.length * this.width;
    }

    /**
     * Gets the perimeter.
     * @return the perimeter.
     */
    @Override
    public double getPerimeter() {

        return 2 * this.length + 2 * this.width;
    }


    /**
     * To string.
     * @return String.
     */
    @Override
    public String toString() {

        return String.format(
                "Rectangle[width=%.1f,length=%.1f,color=%s,filled=%b]",
                this.width,
                this.length,
                this.color,
                this.filled);
    }
}
