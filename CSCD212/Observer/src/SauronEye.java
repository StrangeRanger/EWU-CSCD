// *************************************************************************************
//
// Name:        Hunter T.
// Date:        April 19, 2021
// Class:       CSCD 212
//
// *************************************************************************************

public class SauronEye {
    public static void main(String[] args) {
        EyeOfSauron eye     = new EyeOfSauron();
        GoodGuys    gg      = new GoodGuys(1, 1, 2, 0);
        BadGuy      saruman = new BadGuy(eye, "Sauruman");
        // Didn't include 'BadGuy witchKing' because it was never used, and was
        // therefore pointless to include.
        new BadGuy(eye, "Witch King");

        eye.enemiesSpotted(gg);
        saruman.defeated();
        gg = new GoodGuys(4, 2, 2, 100);
        eye.enemiesSpotted(gg);
    }
}