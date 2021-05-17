/** Information specific to the character named Slash. */
public class GameCharacterSlash extends GameCharacter {
    /** Define Slash's type of guitar and solo act. */
    public GameCharacterSlash() {
        guitarType      = new GibsonFlyingV();    // Default guitar type.
        soloActBehavior = new SetGuitarOnFire();  // Default solo act.
    }

    /** Print the kind of guitar Slash is playing. */
    @Override
    public void playGuitar() {
        System.out.print("Slash");
        guitarType.guitar();
    }

    /** Print what Slash does for his solo. */
    @Override
    public void playSolo() {
        System.out.print("Slash");
        soloActBehavior.soloAct();
    }
}
