package holiday_decorations;

/**
 * Assigns values to 'description' and 'cost' of the 'HolidayComponent' class, for a
 * Douglas Fir tree.
 */
public class DouglasFir extends HolidayComponent {
    private static final int price = 30;

    public DouglasFir() {
        super("Douglas Fir is decorated with", price);
    }
}
