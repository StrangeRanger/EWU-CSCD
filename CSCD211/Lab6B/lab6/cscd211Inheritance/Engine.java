package lab6.cscd211Inheritance;

/**
 * The engine class contains a String for the manufacturer, and an int for the
 * horsePower. This class represents a basic Engine. The manufacturer is private
 * and the horsePower is protected.
 */

public class Engine implements Comparable<Engine> {
    protected int horsePower;
    private String manufacturer;


    /**
     * The constructor that creates an Engine based on the manufacturer and the
     * horsePower.
     *
     * @param manufacturer String representing the manufacturer
     * @param horsePower   An int representing the horsePower
     *
     * @throws IllegalArgumentException If manufacturer is null or empty and if
     *                                  horsePower is less than or equal to 0
     */
    public Engine(final String manufacturer, final int horsePower) {
        this(horsePower, manufacturer);
    }


    /**
     * The constructor that creates an Engine based on the manufacturer and the
     * horsePower.
     *
     * @param manufacturer String representing the manufacturer
     * @param horsePower   An int representing the horsePower
     *
     * @throws IllegalArgumentException If manufacturer is null or empty and if
     *                                  horsePower is less than or equal to 0
     */
    public Engine(final int horsePower, final String manufacturer) {
        if ((manufacturer == null || manufacturer.isEmpty()))
        { throw new IllegalArgumentException("Bad Engine"); }
        if (horsePower <= 0)
        { throw new IllegalArgumentException("Bad Engine"); }

        this.manufacturer = manufacturer;
        this.horsePower = horsePower;

    }


    /**
     * This toString returns Manufacturer the value with HP of the horse power value
     * @return Representing Manufacturer: value with HP of the horse power value
     */
    @Override
    public String toString() {
        return "Manufacturer: " + this.manufacturer + " with HP of " + this.horsePower;
    }


    /**
     * This method returns this horsePower divided by 5.
     *
     * @return int Representing this horsePower divided by 5
     */
    public int calcOutput() {
        return this.horsePower / 5;
    }


    // NOTE: Unsure if this is correct
    /**
     * This compareTo first compares by horsePower. If the horsePowers are the
     * same then it compares by the manufacturer.
     *
     * @param pi
     * @return int Representing natural order
     */
    public int compareTo(Engine pi) {
        if (this.horsePower == pi.horsePower) {
            return this.manufacturer.compareTo(pi.manufacturer);
        } else {
            return String.valueOf(this.horsePower).compareTo(String.valueOf(pi.horsePower));
        }
    }


    /**
     * Returns this manufacturer
     * @return String Representing this manufacturer
     */
    public String getManufacturer() {
        return this.manufacturer;
    }

}
