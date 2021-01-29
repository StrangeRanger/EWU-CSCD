package lab1.cscd211classes;

// *****************************************************************************
//
// Name:        Hunter T.
// Date:        January 29, 2021
// Class:       CSCD 211
// Description: The person class.
//
// *****************************************************************************

import lab1.cscd211enums.*;


/** The person class */
public class Person implements Comparable<Person> {
    /** The person's first name */
    private String fn;
    /** The person's favorite color */
    private String ln;
    /** The person's favorite color */
    private Color color;

    /**
     * Explicit Value Constructor for Person.
     *
     * @param fn    - The first name
     * @param ln    - The last name
     * @param color - The color reference
     *
     * @throws IllegalArgumentException - If any of the parameters are null
     */
    public Person(final String fn, final String ln, final Color color) {
        if (fn == null || ln == null || color == null) {
            throw new IllegalArgumentException("fn, ln, or color is null");
        }

        this.fn = fn;
        this.ln = ln;
        this.color = color;
    }

    /**
     * Compares by last name, if the last names are the same then by first name.
     * If the first names are then same then by color
     *
     * Specified by: compareTo in interface Comparable<Person>
     *
     * @throws IllegalArgumentException - If another is null
     */
    @Override
    public int compareTo(Person another) {
        int res = this.ln.compareTo(another.ln);
        if (res != 0) { return res; }

        res = this.ln.compareTo(another.fn);
        if (res != 0) { return res; }

        return 0;  // Added this because compiler complained about no return
    }

    /**
     * The getColor method
     *
     * @return Color - Returns the reference to the enumerated type Color.
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * The toString returns the first name space last name, color.
     *
     * @return String - First name space last name, color
     */
    @Override
    public String toString() {
        return this.fn + " " + this.ln + ", " + this.color;
    }
}

