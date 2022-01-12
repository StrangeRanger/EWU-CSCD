// *************************************************************************************
//
// Name:        Hunter T.
// Date:        April 25, 2021
// Class:       CSCD 212
//
// *************************************************************************************

import holiday_decorations.*;

/** Main class. */
public class TreeTester {
    /** Main method. */
    public static void main(String[] args) {
        /* Making a first tree. */
        HolidayComponent treeOne = new FraserFir();
        treeOne                  = Star.addStar(treeOne);
        treeOne                  = new Ruffles(treeOne);
        // Should fail to add a star.
        treeOne = Star.addStar(treeOne);
        treeOne = new Ruffles(treeOne);
        treeOne = new Lights(treeOne);
        System.out.println("Tree1: " + treeOne.getDescription() + " costs: $" +
                           treeOne.getCost());

        /* Making a second tree. */
        HolidayComponent treeTwo = new BlueSpruce();
        treeTwo                  = new Ruffles(treeTwo);
        treeTwo                  = new RedBalls(treeTwo);
        treeTwo                  = new SilverBalls(treeTwo);
        treeTwo                  = new Ruffles(treeTwo);
        treeTwo                  = new LEDs(treeTwo);
        System.out.println("Tree2: " + treeTwo.getDescription() + " costs: $" +
                           treeTwo.getCost());

        /* Making a three tree. */
        HolidayComponent treeThree = new BalsamFir();
        treeThree                  = new Ribbons(treeThree);
        treeThree                  = Star.addStar(treeThree);
        treeThree                  = new BlueBalls(treeThree);
        treeThree                  = new Ruffles(treeThree);
        // Should fail to add a star.
        treeThree = Star.addStar(treeThree);
        treeThree = new LEDs(treeThree);
        System.out.println("Tree3: " + treeThree.getDescription() + " costs: $" +
                           treeThree.getCost());

        /* Making a fourth tree. */
        HolidayComponent treeFour = new DouglasFir();
        treeFour                  = new Ruffles(treeFour);
        treeFour                  = Star.addStar(treeFour);
        // Should fail to add a star.
        treeFour = Star.addStar(treeFour);
        treeFour = new LEDs(treeFour);
        treeFour = new RedBalls(treeFour);
        System.out.println("Tree4: " + treeFour.getDescription() + " costs: $" +
                           treeFour.getCost());
    }
}
