package lab6.cscd211Comparator;

// *************************************************************************************
//
// Name:        Hunter T.
// Date:        February 20, 2021
// Class:       CSCD 211
// Description: This class represents a manufacturer sort which is a comparator sort for
//              the Engine class This class ensures the parameters to the compare method
//              are of both type Engine.
//
// *************************************************************************************

import java.util.Comparator;

import lab6.cscd211Inheritance.Engine;

/**
 * This class represents a manufacturer sort which is a comparator sort for the Engine
 * class This class ensures the parameters to the compare method are of both type
 * Engine.
 */
public class ManufacturerComparator implements Comparator<Engine> {
    /**
     * The compare method ensure the 2 parameters are of type Engine. This is an
     * override of the compare method in the Comparator interface. This method simply
     * compares the 2 engine manufacturers for order.
     *
     * @param e1   The first engine.
     * @param e2   The second engine to be compared.
     * @return int Representing if e1 < e2, e1 > e2, or e1 equal to e2 based on the
     *             manufacturer.
     */
    public int compare(final Engine e1, final Engine e2) { return e1.compareTo(e2); }
}
