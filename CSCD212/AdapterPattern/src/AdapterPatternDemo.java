// *************************************************************************************
//
// Name:        Hunter T.
// Class:       CSCD 212
// Description: Program showing the power of the adapter pattern...
//
// *************************************************************************************

import adapters.SquarePegAdapter;
// Imports class: RoundHole and RoundPeg
import round.*;
import sqaure.SquarePeg;

/** Main class. */
public class AdapterPatternDemo {
    /** Main method. */
    public static void main(String[] args) {
        RoundHole        roundHole             = new RoundHole(5);
        RoundPeg         roundPeg              = new RoundPeg(5);
        SquarePeg        smallSquarePeg        = new SquarePeg(2);
        SquarePeg        largeSquarePeg        = new SquarePeg(20);
        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        if (roundHole.fits(roundPeg)) {
            System.out.println("The round peg can fits the round hole");
        }

        // hole.fits(smallSquarePeg);  // Won't fit due to incompatible interfaces

        if (roundHole.fits(smallSquarePegAdapter)) {
            System.out.println("The smaller square peg fits the bigger round hole");
        }

        if (! roundHole.fits(largeSquarePegAdapter)) {
            System.out.println("The bigger square peg doesn't fit the smaller round hole");
        }
    }
}
