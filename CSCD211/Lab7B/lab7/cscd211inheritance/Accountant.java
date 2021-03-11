package lab7.cscd211inheritance;

/** The Accountant class derived from employee. Accountants get a parking stipend. */
public class Accountant extends Employee {
    /** The parkingStipend accountants receive. */
    private double parkingStipend;


    /**
     * EVC additional parameter is a parking stipend.
     *
     * @param name              The name
     * @param basePayrate       The base pay
     * @param additionalPayrate The additional pay
     * @param parkingStipend    The parking stipend
     *
     * @throws IllegalArgumentException If parking stipend is less than 0.00
     */
    public Accountant(String name, double basePayrate, double additionalPayrate, double
                parkingStipend) {
        super(name, basePayrate, additionalPayrate);
        if (parkingStipend < 0.00)
        { throw new IllegalArgumentException("Bad Accountant"); }
        this.parkingStipend = parkingStipend;
    }


    public double getParkingStipend() {
        return this.parkingStipend;
    }


    /**
     * Report prints to the screen I am an accountant. I make "the salary from
     * the base class" plus a parking stipend of "the parking stipend value".
     */
    public void report() {
        System.out.println("I am an Accountant. I make " + getSalary() + " plus a " +
            "parking allowance of " + getParkingStipend() + ".");
    }


    // Unsure if this is correct
    /**
     * Returns Accountant: the parents toString.
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
