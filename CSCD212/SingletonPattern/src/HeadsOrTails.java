// *************************************************************************************
//
// Name:               Hunter T.
// Class:              CSCD 212
// Description:        Allows you to flip a coin any number of times and tracks how many
//                     times it it came out as heads or as tails.
// Note For Professor: A singleton isn't really needed for this program... I probably
//                     should have chosen a better theme but I didn't have a whole lot
//                     of time to think up another one, due to not being able to work on
//                     this earlier in the week.
//
// *************************************************************************************

public class HeadsOrTails {
    /** Main method. */
    public static void main(String[] args) {
        // WILL create a new instance of 'HOTSingleton'.
        HOTSingleton gameOne = HOTSingleton.getUniqueInstance();
        gameOne.flip(100);   // A.1. Flip the coin 100 times.
        gameOne.getCount();  // B.1. Retrieve the number of heads and tails.

        // Will NOT create a new instance of 'HOTSingleton'.
        HOTSingleton gameAll = HOTSingleton.getUniqueInstance();
        gameAll.flip(100);   // A.1.
        gameAll.getCount();  // B.1.
        gameAll.resetCount();     // C.1. Resets the number of heads and tails to 0.

        gameAll.flip(100);   // A.1.
        gameAll.getCount();  // B.1.
        gameAll.flip(100);   // A.1.
        gameAll.getCount();  // B.1.
        gameAll.resetCount();     // C.1.
    }
}
