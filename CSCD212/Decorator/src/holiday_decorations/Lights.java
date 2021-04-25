package holiday_decorations;

/** Lights class. */
public class Lights extends OrnamentDecorator {
    private static final int price = 5;

    /**
     * Constructor.
     *
     * @param component ...
     */
    public Lights(final HolidayComponent component) {
        super("lights", price, component);
    }

    /**
     * Add price to the current cost.
     *
     * @return Price of the lights + current price.
     */
    @Override
    public int getCost() {
        return price + this.component.getCost();
    }

    /**
     * Add ', lights' to current description.
     *
     * @return New description.
     */
    @Override
    public String getDescription() {
        return this.component.getDescription() + ", lights";
    }
}
