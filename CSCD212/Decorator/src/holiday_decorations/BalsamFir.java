package holiday_decorations;

/**
 * Assigns values to 'description' and 'cost' of the 'HolidayComponent' class, for a
 * Balsam Fir tree.
 */
public class BalsamFir extends HolidayComponent {
    private static final int price = 25;

    public BalsamFir() {
        super("Balsam Fir is decorated with", price);
    }
}
