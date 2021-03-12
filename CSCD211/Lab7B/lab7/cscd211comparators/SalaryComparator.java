package lab7.cscd211comparators;

import java.util.Comparator;

import lab7.cscd211inheritance.Employee;

/**
 * The SalaryComparator class the only compares by the Employee salary. The
 * class ensures an Employee is compared. All preconditions will be met and
 * all parameters are final.
 */
public class SalaryComparator implements Comparator<Employee> {
    /**
     * The compare method compares based solely on the salary.
     *
     * @param e1   Representing the first Employee
     * @param e2   Representing the second Employee
     * @return int Representing order of the Employee salary
     *
     * @throws IllegalArgumentException If either Employee is null
     */
    public int compare(final Employee e1, final Employee e2) {
        if (e1 == null || e2 == null) {
            throw new IllegalArgumentException("Bad compare");
        }

        // Code below can be replaced by:
        // return Double.compare(e1.getSalary(), e2.getSalary());
        if (e1.getSalary() > e2.getSalary()) {
            return 1;
        } else if (e1.getSalary() < e2.getSalary()) {
            return -1;
        } else {
            return 0;
        }
    }
}
