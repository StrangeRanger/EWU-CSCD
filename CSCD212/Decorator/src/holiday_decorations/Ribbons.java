package holiday_decorations;

/** Ribbons class. */
public class Ribbons extends OrnamentDecorator {
    private static final int price = 2;

    /**
     * Constructor.
     *
     * @param component ...
     */
    public Ribbons(final HolidayComponent component) {
        super("ribbons", price, component);
    }

    /**
     * Add price to the current cost.
     *
     * @return Price of the ribbons + current price.
     */
    @Override
    public int getCost() {
        return price + this.component.getCost();
    }

    /**
     * Add ', ribbons' to current description.
     *
     * @return New description.
     */
    @Override
    public String getDescription() {
        return this.component.getDescription() + ", ribbons";
    }
}
