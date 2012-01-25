package pl.edu.amu.wmi.daut.base;

/**
 * Klasa reprezentująca przejście wychodzące, tzn. etykietę przejścia plus
 * stan docelowy.
 *
 * Stan źródłowy nie jest tu uwzględniany.
 */
public class OutgoingTransition {
    /**
     * Konstruktor.
     */
    public OutgoingTransition(TransitionLabel aTransitionLabel, State aTargetState) {
        targetState = aTargetState;
        transitionLabel = aTransitionLabel;
    }

    /**
     * Pobiera docelowy stan.
     */
    public State getTargetState() {
        return targetState;
    }

    /**
     * Pobiera etykiete przejscia.
     */
    public TransitionLabel getTransitionLabel() {
        return transitionLabel;
    }

    private State targetState;
    private TransitionLabel transitionLabel;
}
