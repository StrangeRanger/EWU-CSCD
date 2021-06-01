package sqaure;

/** SquarePeg class. */
public class SquarePeg {
    private final double width;

    /**
     * Constructor.
     * @param width The width of the peg.
     */
    public SquarePeg(double width) {
        this.width = width;
    }

    /** Return the radius of the peg. */
    public double getWidth() {
        return width;
    }
}
