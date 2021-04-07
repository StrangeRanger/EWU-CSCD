/** SoloActBehaviior interface. */
interface SoloActBehavior {
    /** To be initialized to print a specific solo act. */
    void soloAct();
}


/** JumpOffStage solo act. */
class JumpOffStage implements SoloActBehavior {
    @Override
    public void soloAct() {
        System.out.println(" jumped off the stage!");
    }
}


/** SmashGuitar solo act. */
class SmashGuitar implements SoloActBehavior {
    @Override
    public void soloAct() {
        System.out.println(" smashed the guitar!");
    }
}


/** SetGuitarOnFire solo act. */
class SetGuitarOnFire implements SoloActBehavior {
    @Override
    public void soloAct() {
        System.out.println(" set the guitar on fire!");
    }
}
