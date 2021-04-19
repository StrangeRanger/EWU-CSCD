import java.util.Observable;

/** ... */
@SuppressWarnings("deprecation")
public class EyeOfSauron extends Observable {
    /**
     * Make changes and updates Observers.
     *
     * @param gg
     */
    public void enemiesSpotted(GoodGuys gg) {
        setChanged();
        notifyObservers(gg);
        clearChanged();
    }
}
