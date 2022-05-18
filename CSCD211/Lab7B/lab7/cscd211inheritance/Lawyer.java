package lab7.cscd211inheritance;

/**
 * The lawyer class derived from employee. Lawyers get stock options.
 *
 * @NOTE All parameters will be passed as final and all preconditions will be met.
 */
public class Lawyer extends Employee {
    private int stockOptions;

    /**
     * EVC additional parameter is stock options.
     *
     * @param name              The name.
     * @param basePayrate       The base pay.
     * @param additionalPayrate The additional pay.
     * @param stockOptions      The stock options.
     *
     * @throws IllegalArgumentException If stock options is less than 0.
     */
    public Lawyer(String name, double basePayrate, double additionalPayrate,
                  int stockOptions) {
        super(name, basePayrate, additionalPayrate);
        if (stockOptions < 0.00) {
            throw new IllegalArgumentException("Bad Lawyer");
        }
        this.stockOptions = stockOptions;
    }

    public int getStockOptions() { return this.stockOptions; }

    /**
     * Report prints to the screen I am an lawyer. I get "the salary from the base
     * class" and I have "stock options value" shares of stock.
     */
    public void report() {
        System.out.println("I am a Lawyer. I get " + getSalary() + " and I have "
                           + getStockOptions() + " shares of stock.");
    }

    // Unsure if this is correct
    /**
     * Returns Lawyer: the parents toString.
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
