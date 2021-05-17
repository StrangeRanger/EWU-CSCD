/** Information specific to the character named Hendrix. */
public class GameCharacterHendrix extends GameCharacter {
    /** Define Hendrix's type of guitar and solo act. */
    public GameCharacterHendrix() {
        guitarType      = new GibsonSG();      // Default guitar type.
        soloActBehavior = new JumpOffStage();  // Default solo act.
    }

    /** Print the kind of guitar Hendrix is playing. */
    @Override
    public void playGuitar() {
        System.out.print("Hendrix");
        guitarType.guitar();
    }

    /** Print what Hendrix does for his solo. */
    @Override
    public void playSolo() {
        System.out.print("Hendrix");
        soloActBehavior.soloAct();
    }
}
