package lab1.cscd211comparators;

// *************************************************************************************
//
// Name:        Hunter T.
// Date:        January 29, 2021
// Class:       CSCD 211
// Description: The ColorComparator lab implements a Comparator and ensures the
//              parameterized type Person is used for the Comparator.
//
// *************************************************************************************

import java.util.Comparator;

import lab1.cscd211classes.*;

/**
 * The ColorComparator lab implements a Comparator and ensures the parameterized type
 * Person is used for the Comparator.
 */
public class ColorComparator implements Comparator<Person> {
    /**
     * The compare method that compares two persons by the Color reference contents.
     *
     * Specified by: compare in interface Comparator<Person>
     *
     * @param p1   The first Person to be compared.
     * @param p2   The second Person to be compared.
     * @return int A negative integer, zero, or a positive integer as the first
     *             argument is less than, equal to, or greater than the second.
     *
     * @throws IllegalArgumentException If either Person 1 or Person 2 are null.
     */
    public int compare(Person p1, Person p2) {
        if (p1 == null || p2 == null) {
            throw new IllegalArgumentException("Person 1 and/or Person 2 are null");
        }

        return p1.getColor().compareTo(p2.getColor());
    }
}
