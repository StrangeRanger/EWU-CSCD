/** Information specific to the character named Angus Young. */
public class GameCharacterYoung extends GameCharacter {
    /** Define Young's type of guitar and solo act. */
    public GameCharacterYoung() {
        guitarType      = new FenderTelecaster();  // Default guitar type.
        soloActBehavior = new SmashGuitar();       // Default solo act.
    }

    /** Print the kind of guitar Angus Young is playing. */
    @Override
    public void playGuitar() {
        System.out.print("Angus Young");
        guitarType.guitar();
    }

    /** Print what Angus Young does for his solo. */
    @Override
    public void playSolo() {
        System.out.print("Angus Young");
        soloActBehavior.soloAct();
    }
}
