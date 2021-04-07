/** Contains general information to be used by all characters. */
public abstract class GameCharacter {
    GuitarType      guitarType;
    SoloActBehavior soloActBehavior;

    /** Calls to 'guitar' to print out the appropriate guitar type. */
    public void playGuitar() {
        guitarType.guitar();
    }

    /** Calls to 'soloAct' to print out the appropriate solo act. */
    public void playSolo() {
        soloActBehavior.soloAct();
    }

    /**
     * Set a new solo act for a character.
     *
     * @param sab The new solo act to be set.
     */
    public void setSolo(SoloActBehavior sab) {
        soloActBehavior = sab;
    }

    /**
     * Set a new guitar type used by a character.
     *
     * @param gt The new guitar type to be set.
     */
    public void setGuitar(GuitarType gt) {
        guitarType = gt;
    }
}
