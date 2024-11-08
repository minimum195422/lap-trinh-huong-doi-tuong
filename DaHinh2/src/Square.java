public class Square extends Rectangle {

    /**
     * Square.
     */
    public Square() {

        super();
    }


    /**
     * Square.
     * @param side  the side.
     */
    public Square(double side) {

        super(side, side);
    }


    /**
     * Square.
     * @param side  the side.
     * @param color  the color.
     * @param filled  the filled.
     */
    public Square(double side, String color, boolean filled) {

        super(side, side, color, filled);
    }


    /**
     * Gets the side.
     * @return the side.
     */
    public double getSide() {

        return super.getLength();
    }


    /**
     * Sets the side.
     * @param side  the side.
     */
    public void setSide(double side) {

        super.setWidth(side);
        super.setLength(side);
    }


    /**
     * Sets the width.
     * @param side  the side.
     */
    @Override
    public void setWidth(double side) {

        super.setLength(side);
        super.setWidth(side);
    }



    /**
     * Sets the length.
     * @param side  the side.
     */
    @Override
    public void setLength(double side) {

        super.setLength(side);
        super.setWidth(side);
    }


    /**
     * To string.
     * @return String.
     */
    @Override
    public String toString() {

        return String.format(
                "Square[side=%.1f,color=%s,filled=%b]",
                this.getSide(),
                this.color,
                this.filled);
    }
}

