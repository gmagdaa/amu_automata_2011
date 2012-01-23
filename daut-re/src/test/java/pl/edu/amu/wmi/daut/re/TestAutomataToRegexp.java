package pl.edu.amu.wmi.daut.re;

import pl.edu.amu.wmi.daut.base.AutomatonSpecification;
import pl.edu.amu.wmi.daut.base.CharTransitionLabel;
import pl.edu.amu.wmi.daut.base.NaiveAutomatonSpecification;
import pl.edu.amu.wmi.daut.base.State;
import junit.framework.TestCase;
/**
 * Test klasy AutomataToRegexp.
 */
public class TestAutomataToRegexp {
   
    public final void testRegA() {

        AutomatonSpecification automatonA = new NaiveAutomatonSpecification();

        State q0 = automatonA.addState();
        State q1 = automatonA.addState();
        automatonA.addTransition(q0, q1, new CharTransitionLabel('a'));
        automatonA.addLoop(q1, new CharTransitionLabel('a'));
        automatonA.addLoop(q1, new CharTransitionLabel('b'));
        automatonA.markAsInitial(q0);
        automatonA.markAsFinal(q1);

        String reg = AutomataToRegexp.createRegularExpression(automatonA);
        assertTrue(reg.equals("a(a*|b*)"));
        asserFalse(reg.equals("(a*|b*)a"));
   }
}
  