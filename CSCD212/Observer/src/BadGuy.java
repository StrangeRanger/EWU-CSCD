import java.util.Observable;
import java.util.Observer;

/** Concrete Observer class. */
@SuppressWarnings("deprecation")
public class BadGuy implements Observer {
    private EyeOfSauron eyeOfSauron;
    private String      name;

    /**
     * DVC constructor to create BadGuy object.
     *
     * @param eyeOfSauron
     * @param name
     */
    BadGuy(EyeOfSauron eyeOfSauron, String name) {
        this.eyeOfSauron = eyeOfSauron;
        this.name        = name;
        eyeOfSauron.addObserver(this);
    }

    /**
     * Update the user that the data has been updated.
     *
     * @param obs
     * @param arg
     */
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof EyeOfSauron) {
            GoodGuys gg = (GoodGuys) arg;
            System.out.println(this.name + " knows about -\n" + gg);
        }
    }

    /** Reset existing Observers. */
    public void defeated() {
        System.out.println(this.name + " was defeated.\n");
        this.eyeOfSauron.deleteObserver(this);
    }
}
