package lab7.cscd211inheritance;

/**
 * The Generic Employee Base class. There will never just be an employee.
 *
 * NOTE: All parameters will be passed as final and all preconditions will be met.
 */
public abstract class Employee implements Comparable<Employee> {

    /** This is a constant representing the BASE pay and can't be changed. */
    private double BASE;
    private String name;
    /** The salary is the BASE + the additional salary. */
    protected double salary;

    /**
     * EVC All parameters are for the private class level variables.
     *
     * @param name              The name
     * @param basePayrate       The base pay
     * @param additionalPayrate The additional pay
     *
     * @throws IllegalArgumentException If any of the strings are empty or the doubles are less than 0
     * @throws IllegalArgumentException If any of the strings are null
     */
    public Employee(String name, double basePayrate, double additionalPayrate) {
        if (name.isEmpty() || basePayrate < 0 || additionalPayrate < 0) {
            throw new IllegalArgumentException("Bad Employee");
        }
        if (name == null) {
            throw new IllegalArgumentException("Bad Employee");
        }

        this.name = name;
        this.BASE = basePayrate;
        this.salary = additionalPayrate;
    }

    /**
     * Return the salary.
     *
     * @return double Salary
     */
    public double getSalary() {
        return this.salary + this.BASE;
    }

    /**
     * Return the base salary.
     *
     * @return double Base salary
     */
    public double getBaseSalary() {
        return this.BASE;
    }

    /**
     * Return the name.
     *
     * @return String Name
     */
    public String getName() {
        return this.name;
    }

    /**
     * This method first gets the class via getClass and then the simple name.
     *
     * @return String the String of the simpleName
     */
    public String getType() {
        return this.getClass().getSimpleName();
    }

    /**
     * Simply returns the name.
     *
     * @return String The name
     */
    @Override
    public String toString() {
        return getName();
    }

    /**
     * compareTo first by type. If the types are the same then by salary.
     *
     * @param another Representing the BCR to the DCO
     * @return int    The order
     *
     * @throws IllegalArgumentException If another is null
     */
    public int compareTo(Employee another) {
        if (another == null) {
            throw new IllegalArgumentException("Bad compareTo");
        }

        if (this.getType().equals(another.getType())) {
            return String
                .valueOf(this.salary)
                .compareTo(String.valueOf(another.salary));
        } else {
            return this.getType().compareTo(another.getType());
        }
    }

    /** The abstract method that will be overridden in the children. */
    public abstract void report();
}
