package holiday_decorations;

/** Silver Balls class. */
public class SilverBalls extends OrnamentDecorator {
    private static final int price = 3;

    /**
     * Constructor.
     *
     * @param component ...
     */
    public SilverBalls(final HolidayComponent component) {
        super("Silver Balls", price, component);
    }

    /**
     * Add price to the current cost.
     *
     * @return Price of the Silver Balls + current price.
     */
    @Override
    public int getCost() {
        return price + this.component.getCost();
    }

    /**
     * Add ', Silver Balls' to current description.
     *
     * @return New description.
     */
    @Override
    public String getDescription() {
        return this.component.getDescription() + ", Silver Balls";
    }
}
