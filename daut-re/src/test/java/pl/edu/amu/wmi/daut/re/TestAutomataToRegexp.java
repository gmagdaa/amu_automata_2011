package pl.edu.amu.wmi.daut.re;

import pl.edu.amu.wmi.daut.base.AutomatonSpecification;
import pl.edu.amu.wmi.daut.base.CharTransitionLabel;
import pl.edu.amu.wmi.daut.base.NaiveAutomatonSpecification;
import pl.edu.amu.wmi.daut.base.State;
import junit.framework.TestCase;

/**
 * Test klasy AutomataToRegexp.
 */
public class TestAutomataToRegexp extends TestCase {
<<<<<<< HEAD
    
/**
 * Test klasy AutomataToRegexp A.
 */   
=======
   
>>>>>>> d89807cadbe23625fade48e14c8714d3232b320b
    public final void testRegA() {

        AutomatonSpecification automatonA = new NaiveAutomatonSpecification();
        State q0 = automatonA.addState();
        State q1 = automatonA.addState();
        State q2 = automatonA.addState();
        State q3 = automatonA.addState();
        automatonA.markAsInitial(q0);
        automatonA.markAsFinal(q2);
        automatonA.markAsFinal(q3);
        
        automatonA.addTransition(q0, q1, new CharTransitionLabel('a'));
        automatonA.addTransition(q0, q2, new CharTransitionLabel('b'));
        automatonA.addTransition(q1, q3, new CharTransitionLabel('d'));
        automatonA.addTransition(q1, q2, new CharTransitionLabel('c'));
        automatonA.addLoop(q3, new CharTransitionLabel('d'));


        String reg = AutomataToRegexp.createRegularExpression(automatonA);
        assertTrue(reg.matches("\\(b\\|ac\\)\\|ad\\+|\\(ac\\|b\\)\\|ad\\+|ad\\+\\|\\(b\\|ac\\)|ad\\+\\(ac\\|b\\)"));
        assertFalse(reg.matches("\\(a\\*\\|b\\*|b\\*\\|a\\*\\)a"));
   }
<<<<<<< HEAD
    
/**
 * Test klasy AutomataToRegexp B.
 */   
    public final void testRegB() {
        
        AutomatonSpecification automatonB = new NaiveAutomatonSpecification();
        State q0 = automatonB.addState();
        automatonB.markAsInitial(q0);
        automatonB.markAsFinal(q0);
        
        String reg = AutomataToRegexp.createRegularExpression(automatonB);
        assertTrue(reg.matches("\u03B5"));
        assertFalse(reg.matches("\\(b\\|ac\\)\\|ad\\+|\\(ac\\|b\\)\\|ad\\+|ad\\+\\|\\(b\\|ac\\)|ad\\+\\(ac\\|b\\)"));
    }

/**
 * Test klasy AutomataToRegexp C.
 */   
    public final void testRegC() {
        
        AutomatonSpecification automatonC = new NaiveAutomatonSpecification();
        State q0 = automatonC.addState();
        State q1 = automatonC.addState();
        automatonC.markAsInitial(q0);
        automatonC.markAsFinal(q0);
        automatonC.markAsFinal(q1);
        automatonC.addTransition(q0, q1, new CharTransitionLabel('a'));
        
        String reg = AutomataToRegexp.createRegularExpression(automatonC);
        assertTrue(reg.matches("\u03B5"));
        assertFalse(reg.matches("\\(b\\|ac\\)\\|ad\\+|\\(ac\\|b\\)\\|ad\\+|ad\\+\\|\\(b\\|ac\\)|ad\\+\\(ac\\|b\\)"));
    }

=======
>>>>>>> d89807cadbe23625fade48e14c8714d3232b320b
}