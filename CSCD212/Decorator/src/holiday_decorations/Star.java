package holiday_decorations;

/** Star class. */
public class Star extends OrnamentDecorator {
    private static final int price = 4;

    /**
     * Non-argument constructor.
     */
    private Star() { super(null, -1, null); }

    /**
     * Constructor.
     *
     * @param component ...
     */
    private Star(final HolidayComponent component) { super("Star", price, component); }

    /**
     * Add price to the current cost.
     *
     * @return Price of the star + current price.
     */
    @Override
    public int getCost() {
        return price + this.component.getCost();
    }

    /**
     * Add ', Star' to current description.
     *
     * @return New description.
     */
    @Override
    public String getDescription() {
        return this.component.getDescription() + ", Star";
    }

    /**
     * Check if the component (or decorated component) has been decorated with a star
     * decorator by checking the description.
     *
     * @param comp ...
     */
    public static HolidayComponent addStar(final HolidayComponent comp) {
        if (comp.getDescription().contains("Star")) {
            System.out.println("The tree already has a star");
            return comp;
        } else {
            return new Star(comp);
        }
    }
}
