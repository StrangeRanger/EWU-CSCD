// *************************************************************************************
//
// Name:         Hunter T.
// Class:        CSCD 212
// Descriptions: Prints out what each Guitar Hero character plays (the kind of guitar)
// 				 and what they do for their solo act.
//
// *************************************************************************************

/** Main class. */
public class GuitarHero {
    /** Main method. */
    public static void main(String[] args) {
        GameCharacter player1 = new GameCharacterSlash();
        GameCharacter player2 = new GameCharacterHendrix();
        GameCharacter player3 = new GameCharacterYoung();

        /* Print out the default guitar type for each character. */
        player1.playGuitar();
        player2.playGuitar();
        player3.playGuitar();
        /* Print out the default solo act that each character performs. */
        player1.playSolo();
        player2.playSolo();
        player3.playSolo();

        /* Set a new solo act for each character. */
        player1.setSolo(new JumpOffStage());
        player2.setSolo(new SmashGuitar());
        player3.setSolo(new SetGuitarOnFire());
        /* Print the new solo acts of each character. */
        player1.playSolo();
        player2.playSolo();
        player3.playSolo();

        /* Set a new type of guitar each character uses. */
        player1.setGuitar(new GibsonSG());
        player2.setGuitar(new FenderTelecaster());
        player3.setGuitar(new GibsonFlyingV());
        /* Print the new guitar type that each character uses. */
        player1.playGuitar();
        player2.playGuitar();
        player3.playGuitar();
    }
}
