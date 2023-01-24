package holiday_decorations;

/** LEDs class. */
public class LEDs extends OrnamentDecorator {
    private static final int price = 10;

    /**
     * Constructor.
     *
     * @param component ...
     */
    public LEDs(final HolidayComponent component) {
        super("LEDs", price, component);
    }

    /**
     * Add price to the current cost.
     *
     * @return Price of the LEDs + current price.
     */
    @Override
    public int getCost() {
        return price + this.component.getCost();
    }

    /**
     * Add ', LEDs' to current description.
     *
     * @return New description.
     */
    @Override
    public String getDescription() {
        return this.component.getDescription() + ", LEDs";
    }
}
