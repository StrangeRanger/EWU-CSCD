package holiday_decorations;

/** Red Balls class. */
public class RedBalls extends OrnamentDecorator {
    private static final int price = 1;

    /**
     * Constructor.
     *
     * @param component ...
     */
    public RedBalls(final HolidayComponent component) {
        super("Red Balls", price, component);
    }

    /**
     * Add price to the current cost.
     *
     * @return Price of the RedBalls + current price.
     */
    @Override
    public int getCost() {
        return price + this.component.getCost();
    }

    /**
     * Add ', Red Balls' to current description.
     *
     * @return New description.
     */
    @Override
    public String getDescription() {
        return this.component.getDescription() + ", Red Balls";
    }
}
