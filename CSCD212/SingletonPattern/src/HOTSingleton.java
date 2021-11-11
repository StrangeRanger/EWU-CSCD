import java.util.Random;

/** Heads or Tails Singleton Pattern class. */
public class HOTSingleton {
    private static HOTSingleton uniqueInstance;
    private int                 heads = 0;
    private int                 tails = 0;

    /** Private constructor. */
    private HOTSingleton() { }

    /** Create or return an already existing instance of HOTSingleton. */
    public static synchronized HOTSingleton getUniqueInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating new object");
            uniqueInstance = new HOTSingleton();
        }

        System.out.println("Returning object");
        return uniqueInstance;
    }

    /** Flip a coin x number times and count the number of heads and tails occur. */
    public void flip(int timesToFlip) {
        Random rand = new Random();

        for (int i = 0; i < timesToFlip; i++) {
            int randInt = rand.nextInt(2);

            if (randInt == 0) {
                heads += 1;
            } else {
                tails += 1;
            }
        }
    }

    /** Print out the total number of times the coin has landed on heads and tails. */
    public void getCount() {
        System.out.println(
                "Displaying number times heads and tails occured respectively: " +
                heads + " | " + tails);
    }

    /** Reset the number of heads and tails to 0. */
    public void resetCount() {
        heads = 0;
        tails = 0;

        System.out.println("Resetting count");
    }
}
