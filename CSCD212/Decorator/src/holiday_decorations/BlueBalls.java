package holiday_decorations;

/** Blue Balls class. */
public class BlueBalls extends OrnamentDecorator {
    private static final int price = 2;

    /**
     * Constructor.
     *
     * @param component ...
     */
    public BlueBalls(final HolidayComponent component) {
        super("Blue Balls", price, component);
    }

    /**
     * Add price to the current cost.
     *
     * @return Price of the BlueBalls + current price.
     */
    @Override
    public int getCost() {
        return price + this.component.getCost();
    }

    /**
     * Add ', Blue Balls' to current description.
     *
     * @return New description.
     */
    @Override
    public String getDescription() {
        return this.component.getDescription() + ", Blue Balls";
    }
}
