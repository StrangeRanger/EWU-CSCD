package lab6.cscd211Inheritance;

// *****************************************************************************
//
// Name:        Hunter T.
// Date:        February 20, 2021
// Class:       CSCD 211
// Description: The CarEngine class is a child of the Engine class. It contains
//              NO additional parameters.
//
// *****************************************************************************

/**
 * The CarEngine class is a child of the Engine class. It contains NO
 * additional parameters.
 */

public class CarEngine extends Engine {
    /**
     * CarEngine calls the appropriate constructor of Engine.
     *
     * @param manufacturer Representing the manufacturer held in the Engine class
     * @param horsePower   Representing the horsePower held in the Engine class
     */
    public CarEngine(final String manufacturer, final int horsePower) {
        super(manufacturer, horsePower);
    }

    /**
     * CarEngine calls the appropriate constructor of Engine.
     *
     * @param horsePower   Representing the horsePower held in the Engine class
     * @param manufacturer Representing the manufacturer held in the Engine class
     */
    public CarEngine(final int horsePower, final String manufacturer) {
        super(horsePower, manufacturer);
    }

    /**
     * The toString returns Car Engine and the value from the toString in the Engine
     * class.
     *
     * @return String Representing Car Engine - the value from the Engine class
     *         toString.
     */
    @Override
    public String toString() {
        return "Car Engine - " + super.toString();
    }

    /**
     * This method calls the calcOutput from the Engine class and then divides that
     * value by 12.
     *
     * return - int The Engine class calcOutput value divided by 12.
     */
    @Override
    public int calcOutput() {
        return super.calcOutput() / 12;
    }
}
