package adapters;

import round.RoundPeg;
import sqaure.SquarePeg;

/** Allows RoundPeg to interface with SquarePeg. */
public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg peg;

    /**
     * Constructor.
     * @param peg ...
     */
    public SquarePegAdapter(SquarePeg peg) {
        super(peg.getWidth());
        this.peg = peg;
    }

    /**
     * Return the width of a square peg as a radius.
     * @return Width as a radius.
     */
    @Override
    public double getRadius() {
        double result;

        result = Math.sqrt(Math.pow(peg.getWidth(), 2) / 2) * 2;
        return result;
    }
}
