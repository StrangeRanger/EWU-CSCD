package holiday_decorations;

/** Decorator class used by all object that hang from the tree (the ornaments). */
public class OrnamentDecorator extends HolidayComponent {
    HolidayComponent component;

    /**
     * Decorator constructor.
     *
     * @param desc      Ornament description.
     * @param cost      Ornament cost/price.
     * @param component Ornament component object.
     */
    public OrnamentDecorator(final String desc, final int cost,
                             final HolidayComponent component) {
        super(desc, cost);
        if (component != null) { this.component = component; }
    }
}
