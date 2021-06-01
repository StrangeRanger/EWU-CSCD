/** GoodGuys class. */
public class GoodGuys {
    private int hobbits;
    private int elves;
    private int dwarfs;
    private int humans;

    /** Constructor. */
    GoodGuys() {
        this.hobbits = 0;
        this.elves   = 0;
        this.dwarfs  = 0;
        this.humans  = 0;
    }

    /**
     * Constructor.
     *
     * @param hobbits
     * @param elves
     * @param dwarfs
     * @param humans
     */
    GoodGuys(int hobbits, int elves, int dwarfs, int humans) {
        this.hobbits = hobbits;
        this.elves   = elves;
        this.dwarfs  = dwarfs;
        this.humans  = humans;
    }

    /** toString override. */
    @Override
    public String toString() {
        return "    Hobbits: " + this.hobbits + "\n"
                + "    Elves: " + this.elves + "\n"
                + "    Dwarfs: " + this.dwarfs + "\n"
                + "    Humans: " + this.humans + "\n";
    }
}
