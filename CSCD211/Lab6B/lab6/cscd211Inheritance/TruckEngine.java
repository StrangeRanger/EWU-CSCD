package lab6.cscd211Inheritance;

// *************************************************************************************
//
// Name:        Hunter T.
// Date:        February 20, 2021
// Class:       CSCD 211
// Description: The TruckEngine class is a child of the Engine class. It contains an
//              additional parameter, a boolean, indicating if the truck contains a
//              diesel engine or not. This parameter will be used in the calcOutput
//              method.
//
// *************************************************************************************

/**
 * The TruckEngine class is a child of the Engine class. It contains an additional
 * parameter, a boolean, indicating if the truck contains a diesel engine or not. This
 * parameter will be used in the calcOutput method.
 */
public class TruckEngine extends Engine {
    private boolean diesel;

    /**
     * TruckEngine first calls the appropriate constructor of Engine and then sets the
     * boolean.
     *
     * @param manufacturer Representing the manufacturer held in the Engine class.
     * @param horsePower   Representing the horsePower held in the Engine class.
     * @param diesel       Boolean representing if the Truck Engine is a diesel engine.
     */
    public TruckEngine(final String manufacturer, final int horsePower,
                       final boolean diesel) {
        super(manufacturer, horsePower);
        this.diesel = diesel;
    }

    /**
     * The to String returns Truck Engine - the value + a call to the Engine class
     * toString and (is a diesel engine or is NOT a diesel engine) depending on the
     * boolean diesel.
     *
     * @return Representing Manufacturer: value with HP of the horse power value.
     */
    @Override
    public String toString() {
        return ("Truck Engine - " + super.toString() +
                (this.diesel ? " is a "
                                       + "diesel engine"
                             : " is NOT a diesel Engine"));
    }

    /**
     * The calcOutput method first grabs the value from the Engine calcOutput method. If
     * the TruckEngine is a diesel engine that value is divided by 18 otherwise the
     * value is divided by 8 for non-diesel.
     *
     * @return int Representing the output value.
     */
    @Override
    public int calcOutput() {
        if (this.diesel) {
            return super.calcOutput() / 18;
        } else {
            return super.calcOutput() / 8;
        }
    }
}
