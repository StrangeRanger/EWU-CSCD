package lab1.cscd211enums;

// *************************************************************************************
//
// Name:        Hunter T.
// Date:        January 29, 2021
// Class:       CSCD 211
// Description: Enumerated constant values for this lab are RED, GREEN, BLUE, PURPLE in
//              this order.
//
// *************************************************************************************

/**
 * The enumerated type Color.
 * Enumerated constant values for this lab are RED, GREEN, BLUE, PURPLE in this order.
 *
 * NOTE: In the enumerated type valueOf and values are automatically provided by the
 * enumerated type. You will NOT write valueOf or values for this enumerated type, You
 * can't write a compareTo method for this enumerated type. It is already defined by the
 * Enum class.
 */
public enum Color {
    RED,
    GREEN,
    BLUE,
    PURPLE;

    @Override
    public String toString() {
        return this.name().charAt(0)
                + this.name().substring(1).toLowerCase();  // RED turned into into Red
    }
}
