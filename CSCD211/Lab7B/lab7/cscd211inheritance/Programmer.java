package lab7.cscd211inheritance;

/**
 * The Programmer class derived from employee. Accountants get a bus pass maybe.
 *
 * @NOTE All parameters will be passed as final and all preconditions will be met.
 */
public class Programmer extends Employee {
    /** A programmer is given a bus pass. */
    private boolean busPass;

    /**
     * EVC additional parameter is a bus pass.
     *
     * @param name              The name.
     * @param basePayrate       The base pay.
     * @param additionalPayrate The additional pay.
     * @param busPass           The bus pass.
     */
    public Programmer(String name, double basePayrate, double additionalPayrate,
                      boolean busPass) {
        super(name, basePayrate, additionalPayrate);
        this.busPass = busPass;
    }

    public boolean getBusPass() { return this.busPass; }

    /**
     * Report prints to the screen I am a programmer. I get "the salary from the base
     * class" and I get a bus pass or and I do not get a bus pass.
     */
    public void report() {
        System.out.println("I am a Programmer. I get " + getSalary() +
                           ((getBusPass()) ? " and I get a buss pass." :
                                             " and I do not get a bus pass."));
    }

    // Unsure if this is correct
    /**
     * Returns Programmer: the parents toString.
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
