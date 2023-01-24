package round;

/** RoundHole class. */
public class RoundHole {
    private final double radius;

    /**
     * Constructor.
     * @param radius Radius of the hole.
     */
    public RoundHole(double radius) {
        this.radius = radius;
    }

    /** Return the radius of the hole. */
    public double getRadius() {
        return radius;
    }

    /**
     * Test if a peg fits the hole.
     * @param peg ...
     * @return    If the peg is smaller in size than the hole, return True, else false.
     */
    public boolean fits(RoundPeg peg) {
        return (this.getRadius() >= peg.getRadius());
    }
}
