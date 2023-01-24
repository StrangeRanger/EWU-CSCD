package holiday_decorations;

/** Abstract class extended by 'OrnamentDecorator'.  */
public class HolidayComponent {
    private String description;
    private int    cost;

    /**
     * Constructor to set up the component description and cost.
     *
     * @param desc Component description.
     * @param cost Component cost.
     */
    public HolidayComponent(final String desc, final int cost) {
        if (desc == null || cost < 0) {
            throw new IllegalArgumentException("Invalid HolidayComponent");
        }

        this.description = desc;
        this.cost        = cost;
    }

    /** Return component description. */
    public String getDescription() {
        return description;
    }

    /** Return component cost. */
    public int getCost() {
        return cost;
    }
}
