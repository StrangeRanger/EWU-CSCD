package holiday_decorations;

/** Ruffles class. */
public class Ruffles extends OrnamentDecorator {
    private static final int price = 1;

    /**
     * Constructor.
     *
     * @param component ...
     */
    public Ruffles(final HolidayComponent component) {
        super("ruffles", price, component);
    }

    /**
     * Add price to the current cost.
     *
     * @return Price of the ruffles + current price.
     */
    @Override
    public int getCost() {
        return price + this.component.getCost();
    }

    /**
     * Add ', ruffles' to current description.
     *
     * @return New description.
     */
    @Override
    public String getDescription() {
        return this.component.getDescription() + ", ruffles";
    }
}
