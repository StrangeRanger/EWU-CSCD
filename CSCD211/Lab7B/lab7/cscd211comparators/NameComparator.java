package lab7.cscd211comparators;

import java.util.Comparator;

import lab7.cscd211inheritance.Employee;

/**
 * The NameComparator class the only compares by the Employee name The class ensures an
 * Employee is compared. All preconditions will be met and all parameters are final.
 */
public class NameComparator implements Comparator<Employee> {
    /**
     * The compare method compares based solely on the name.
     *
     * @param e1   Representing the first Employee.
     * @param e2   Representing the second Employee.
     * @return int Representing order of the Employee names.
     *
     * @throws IllegalArgumentException If either Employee is null.
     */
    public int compare(final Employee e1, final Employee e2) {
        if (e1 == null || e2 == null) {
            throw new IllegalArgumentException("Bad compare");
        }
        return e1.getName().compareTo(e2.getName());
    }
}
