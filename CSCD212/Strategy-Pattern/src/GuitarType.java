/** GuitarType interface. */
interface GuitarType {
    /** To be initialized to print a specific guitar type. */
    void guitar();
}


/** GibsonSG guitar type. */
class GibsonSG implements GuitarType {
    @Override
    public void guitar() {
        System.out.println(" is playing a Gibson SG!");
    }
}


/** FenderTelecaster guitar type. */
class FenderTelecaster implements GuitarType {
    @Override
    public void guitar() {
        System.out.println(" is playing a Fender Telecaster!");
    }
}


/** GibsonFlyingV guitar type. */
class GibsonFlyingV implements GuitarType {
    @Override
    public void guitar() {
        System.out.println(" is playing a Gibson Flying V!");
    }
}
