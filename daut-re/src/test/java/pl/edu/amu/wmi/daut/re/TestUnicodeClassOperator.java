package pl.edu.amu.wmi.daut.re;

import java.util.ArrayList;
import pl.edu.amu.wmi.daut.base.NondeterministicAutomatonByThompsonApproach;
import pl.edu.amu.wmi.daut.base.AutomatonSpecification;
import junit.framework.TestCase;

/**
 * Test klasy UnicodeClassOperator.
 */
public class TestUnicodeClassOperator extends TestCase {

    /**
     * Test konstruktora UnicodeClassOperator dla zlych wartosci parametru.
     */
    public void testUnicodeClassOperatorWrongParams() {
        try {
            ArrayList<String> params = new ArrayList<String>();
            params.add("zlyTest1");
            (new UnicodeClassOperator.Factory()).createOperator(params);
            fail();
        } catch (UnknownUnicodeClassException e) {
            assertTrue(true);
        }
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Arabic.
     */
    public final void testUnicodeClassOperatorArabic() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Arabic");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0660"));
        assertTrue(automaton.accepts("\u0770"));
        assertTrue(automaton.accepts("\uFB50"));
        assertTrue(automaton.accepts("\u10E60"));
        assertTrue(automaton.accepts("\u10E7F"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Armenian.
     */
    public final void testUnicodeClassOperatorArmenian() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Armenian");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0530"));
        assertTrue(automaton.accepts("\u058F"));
        assertTrue(automaton.accepts("\uFB13"));
        assertTrue(automaton.accepts("\uFB17"));
        assertTrue(automaton.accepts("\u0555"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Balinese.
     */
    public final void testUnicodeClassOperatorBalinese() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Balinese");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1B00"));
        assertTrue(automaton.accepts("\u1B7F"));
        assertTrue(automaton.accepts("\u1B70"));
        assertTrue(automaton.accepts("\u1B10"));
        assertTrue(automaton.accepts("\u1B66"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Bengali.
     */
    public final void testUnicodeClassOperatorBengali() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Bengali");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0980"));
        assertTrue(automaton.accepts("\u09FF"));
        assertTrue(automaton.accepts("\u0990"));
        assertTrue(automaton.accepts("\u09A0"));
        assertTrue(automaton.accepts("\u09F5"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Bopomofo.
     */
    public final void testUnicodeClassOperatorBopomofo() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Bopomofo");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u3100"));
        assertTrue(automaton.accepts("\u312F"));
        assertTrue(automaton.accepts("\u31A0"));
        assertTrue(automaton.accepts("\u31BF"));
        assertTrue(automaton.accepts("\u31AA"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Braille.
     */
    public final void testUnicodeClassOperatorBraille() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Braille");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u2800"));
        assertTrue(automaton.accepts("\u28FF"));
        assertTrue(automaton.accepts("\u28F0"));
        assertTrue(automaton.accepts("\u28EF"));
        assertTrue(automaton.accepts("\u28AF"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Buginese.
     */
    public final void testUnicodeClassOperatorBuginese() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Buginese");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1A00"));
        assertTrue(automaton.accepts("\u1A1F"));
        assertTrue(automaton.accepts("\u1A10"));
        assertTrue(automaton.accepts("\u1A1E"));
        assertTrue(automaton.accepts("\u1A01"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Buhid.
     */
    public final void testUnicodeClassOperatorBuhid() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Buhid");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1740"));
        assertTrue(automaton.accepts("\u175F"));
        assertTrue(automaton.accepts("\u1745"));
        assertTrue(automaton.accepts("\u1750"));
        assertTrue(automaton.accepts("\u1755"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Canadian Aboriginal.
     */
    public final void testUnicodeClassOperatorCanadianAboriginal() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Canadian Aboriginal");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1400"));
        assertTrue(automaton.accepts("\u167F"));
        assertTrue(automaton.accepts("\u18B0"));
        assertTrue(automaton.accepts("\u18FF"));
        assertTrue(automaton.accepts("\u1500"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Carian.
     */
    public final void testUnicodeClassOperatorCanadianCarian() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Carian");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u102A0"));
        assertTrue(automaton.accepts("\u102DF"));
        assertTrue(automaton.accepts("\u102A1"));
        assertTrue(automaton.accepts("\u102A2"));
        assertTrue(automaton.accepts("\u102B0"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Canadian Cham.
     */
    public final void testUnicodeClassOperatorCham() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Cham");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\uAA00"));
        assertTrue(automaton.accepts("\uAA5F"));
        assertTrue(automaton.accepts("\uAA0F"));
        assertTrue(automaton.accepts("\uAA0B"));
        assertTrue(automaton.accepts("\uAA30"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Canadian Cherokee.
     */
    public final void testUnicodeClassOperatorCherokee() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Cherokee");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u13A0"));
        assertTrue(automaton.accepts("\u13FF"));
        assertTrue(automaton.accepts("\u13AA"));
        assertTrue(automaton.accepts("\u13B0"));
        assertTrue(automaton.accepts("\u13C0"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Coptic.
     */
    public final void testUnicodeClassOperatorCoptic() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Coptic");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u2C80"));
        assertTrue(automaton.accepts("\u2CFF"));
        assertTrue(automaton.accepts("\u2CFA"));
        assertTrue(automaton.accepts("\u2CF0"));
        assertTrue(automaton.accepts("\u2C9F"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Cuneiform.
     */
    public final void testUnicodeClassOperatorCuneiform() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Cuneiform");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u12000"));
        assertTrue(automaton.accepts("\u1237F"));
        assertTrue(automaton.accepts("\u12400"));
        assertTrue(automaton.accepts("\u1247F"));
        assertTrue(automaton.accepts("\u1241F"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Cypriot.
     */
    public final void testUnicodeClassOperatorCypriot() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Cypriot");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u10800"));
        assertTrue(automaton.accepts("\u1083F"));
        assertTrue(automaton.accepts("\u10100"));
        assertTrue(automaton.accepts("\u1013F"));
        assertTrue(automaton.accepts("\u1011F"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Cyrillic.
     */
    public final void testUnicodeClassOperatorCyrillic() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Cyrillic");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0400"));
        assertTrue(automaton.accepts("\u0500"));
        assertTrue(automaton.accepts("\u2DE0"));
        assertTrue(automaton.accepts("\uA640"));
        assertTrue(automaton.accepts("\uA69F"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Deseret.
     */
    public final void testUnicodeClassOperatorDeseret() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Deseret");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u10400"));
        assertTrue(automaton.accepts("\u1044F"));
        assertTrue(automaton.accepts("\u10410"));
        assertTrue(automaton.accepts("\u10420"));
        assertTrue(automaton.accepts("\u10430"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Devanagari.
     */
    public final void testUnicodeClassOperatorDevanagari() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Devanagari");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0900"));
        assertTrue(automaton.accepts("\u097F"));
        assertTrue(automaton.accepts("\u1CD0"));
        assertTrue(automaton.accepts("\u1CFF"));
        assertTrue(automaton.accepts("\uA8F0"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Ethiopic.
     */
    public final void testUnicodeClassOperatorEthiopic() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Ethiopic");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1200"));
        assertTrue(automaton.accepts("\u137F"));
        assertTrue(automaton.accepts("\u139F"));
        assertTrue(automaton.accepts("\u2DDF"));
        assertTrue(automaton.accepts("\uAB20"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Georgian.
     */
    public final void testUnicodeClassOperatorGeorgian() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Georgian");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u10A0"));
        assertTrue(automaton.accepts("\u10FF"));
        assertTrue(automaton.accepts("\u10D0"));
        assertTrue(automaton.accepts("\u10A0"));
        assertTrue(automaton.accepts("\u2D0F"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Glagolitic.
     */
    public final void testUnicodeClassOperatorGlagolitic() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Glagolitic");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u2C00"));
        assertTrue(automaton.accepts("\u2C5F"));
        assertTrue(automaton.accepts("\u2C40"));
        assertTrue(automaton.accepts("\u2C30"));
        assertTrue(automaton.accepts("\u2C0F"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Gothic.
     */
    public final void testUnicodeClassOperatorGothic() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Gothic");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u10330"));
        assertTrue(automaton.accepts("\u1034F"));
        assertTrue(automaton.accepts("\u10331"));
        assertTrue(automaton.accepts("\u1033A"));
        assertTrue(automaton.accepts("\u10340"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Greek.
     */
    public final void testUnicodeClassOperatorGreek() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Greek");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0370"));
        assertTrue(automaton.accepts("\u03FF"));
        assertTrue(automaton.accepts("\u1F00"));
        assertTrue(automaton.accepts("\u1FFF"));
        assertTrue(automaton.accepts("\u1FBB"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Gujarati.
     */
    public final void testUnicodeClassOperatorGujarati() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Gujarati");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0A80"));
        assertTrue(automaton.accepts("\u0AFF"));
        assertTrue(automaton.accepts("\u0A90"));
        assertTrue(automaton.accepts("\u0AA0"));
        assertTrue(automaton.accepts("\u0ACC"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Gurmukhi.
     */
    public final void testUnicodeClassOperatorGurmukhi() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Gurmukhi");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0A00"));
        assertTrue(automaton.accepts("\u0A7F"));
        assertTrue(automaton.accepts("\u0A10"));
        assertTrue(automaton.accepts("\u0A22"));
        assertTrue(automaton.accepts("\u0A55"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Han.
     */
    public final void testUnicodeClassOperatorHan() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Han");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u5555"));
        assertTrue(automaton.accepts("\u4000"));
        assertTrue(automaton.accepts("\u20000"));
        assertTrue(automaton.accepts("\u2A700"));
        assertTrue(automaton.accepts("\u2B840"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Hangul.
     */
    public final void testUnicodeClassOperatorHangul() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Hangul");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1100"));
        assertTrue(automaton.accepts("\u3130"));
        assertTrue(automaton.accepts("\uA960"));
        assertTrue(automaton.accepts("\uD7B0"));
        assertTrue(automaton.accepts("\uD7CC"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Hanunoo.
     */
    public final void testUnicodeClassOperatorHanunoo() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Hanunoo");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1720"));
        assertTrue(automaton.accepts("\u173F"));
        assertTrue(automaton.accepts("\u1721"));
        assertTrue(automaton.accepts("\u1730"));
        assertTrue(automaton.accepts("\u1732"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Hebrew.
     */
    public final void testUnicodeClassOperatorHebrew() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Hebrew");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0590"));
        assertTrue(automaton.accepts("\u05FF"));
        assertTrue(automaton.accepts("\uFB1D"));
        assertTrue(automaton.accepts("\uFB4F"));
        assertTrue(automaton.accepts("\u05AA"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Hiragana.
     */
    public final void testUnicodeClassOperatorHiragana() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Hiragana");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u3040"));
        assertTrue(automaton.accepts("\u309F"));
        assertTrue(automaton.accepts("\u3050"));
        assertTrue(automaton.accepts("\u3060"));
        assertTrue(automaton.accepts("\u3070"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Kannada.
     */
    public final void testUnicodeClassOperatorKannada() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Kannada");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0C80"));
        assertTrue(automaton.accepts("\u0CFF"));
        assertTrue(automaton.accepts("\u0C90"));
        assertTrue(automaton.accepts("\u0CAA"));
        assertTrue(automaton.accepts("\u0CC0"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Katakana.
     */
    public final void testUnicodeClassOperatorKatakana() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Katakana");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u30A0"));
        assertTrue(automaton.accepts("\u30FF"));
        assertTrue(automaton.accepts("\u31F0"));
        assertTrue(automaton.accepts("\u31FF"));
        assertTrue(automaton.accepts("\u30CC"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Kayah Li.
     */
    public final void testUnicodeClassOperatorKayahLi() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Kayah Li");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\uA900"));
        assertTrue(automaton.accepts("\uA92F"));
        assertTrue(automaton.accepts("\uA910"));
        assertTrue(automaton.accepts("\uA920"));
        assertTrue(automaton.accepts("\uA922"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Kharoshthi.
     */
    public final void testUnicodeClassOperatorKharoshthi() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Kharoshthi");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u10A00"));
        assertTrue(automaton.accepts("\u10A5F"));
        assertTrue(automaton.accepts("\u10A10"));
        assertTrue(automaton.accepts("\u10A20"));
        assertTrue(automaton.accepts("\u10A30"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Khmer.
     */
    public final void testUnicodeClassOperatorKhmer() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Khmer");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1780"));
        assertTrue(automaton.accepts("\u17FF"));
        assertTrue(automaton.accepts("\u19E0"));
        assertTrue(automaton.accepts("\u19FF"));
        assertTrue(automaton.accepts("\u17AA"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Lao.
     */
    public final void testUnicodeClassOperatorLao() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Lao");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0E80"));
        assertTrue(automaton.accepts("\u0EFF"));
        assertTrue(automaton.accepts("\u0EAA"));
        assertTrue(automaton.accepts("\u0EBB"));
        assertTrue(automaton.accepts("\u0ECC"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Latin.
     */
    public final void testUnicodeClassOperatorLatin() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Latin");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0060"));
        assertTrue(automaton.accepts("\u1D60"));
        assertTrue(automaton.accepts("\u0100"));
        assertTrue(automaton.accepts("\u1E50"));
        assertTrue(automaton.accepts("\u1D40F"));

        assertFalse(automaton.accepts("\u1720"));
        assertFalse(automaton.accepts("\u11FF"));
        assertFalse(automaton.accepts("\u1034F"));
        assertFalse(automaton.accepts("\u2A6DF"));
        assertFalse(automaton.accepts("\u30A0"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Lepcha.
     */
    public final void testUnicodeClassOperatorLepcha() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Lepcha");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1C00"));
        assertTrue(automaton.accepts("\u1C4F"));
        assertTrue(automaton.accepts("\u1C10"));
        assertTrue(automaton.accepts("\u1C20"));
        assertTrue(automaton.accepts("\u1C30"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Limbu.
     */
    public final void testUnicodeClassOperatorLimbu() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Limbu");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1900"));
        assertTrue(automaton.accepts("\u194F"));
        assertTrue(automaton.accepts("\u1910"));
        assertTrue(automaton.accepts("\u1920"));
        assertTrue(automaton.accepts("\u1930"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Linear B.
     */
    public final void testUnicodeClassOperatorLinearB() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Linear B");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u10000"));
        assertTrue(automaton.accepts("\u10080"));
        assertTrue(automaton.accepts("\u10100"));
        assertTrue(automaton.accepts("\u1013F"));
        assertTrue(automaton.accepts("\u1011F"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Lycian.
     */
    public final void testUnicodeClassOperatorLycian() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Lycian");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u10280"));
        assertTrue(automaton.accepts("\u1029F"));
        assertTrue(automaton.accepts("\u10290"));
        assertTrue(automaton.accepts("\u10299"));
        assertTrue(automaton.accepts("\u10285"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Lydian.
     */
    public final void testUnicodeClassOperatorLydian() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Lydian");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u10920"));
        assertTrue(automaton.accepts("\u1093F"));
        assertTrue(automaton.accepts("\u10930"));
        assertTrue(automaton.accepts("\u10933"));
        assertTrue(automaton.accepts("\u1093A"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Malayalam.
     */
    public final void testUnicodeClassOperatorMalayalam() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Malayalam");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0D00"));
        assertTrue(automaton.accepts("\u0D7F"));
        assertTrue(automaton.accepts("\u0D10"));
        assertTrue(automaton.accepts("\u0D22"));
        assertTrue(automaton.accepts("\u0D33"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Mongolian.
     */
    public final void testUnicodeClassOperatorMongolian() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Mongolian");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1800"));
        assertTrue(automaton.accepts("\u18AF"));
        assertTrue(automaton.accepts("\u18A0"));
        assertTrue(automaton.accepts("\u180A"));
        assertTrue(automaton.accepts("\u1855"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Myanmar.
     */
    public final void testUnicodeClassOperatorMyanmar() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Myanmar");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1000"));
        assertTrue(automaton.accepts("\u109F"));
        assertTrue(automaton.accepts("\uAA60"));
        assertTrue(automaton.accepts("\uAA7B"));
        assertTrue(automaton.accepts("\uAA70"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia New Tai Lue.
     */
    public final void testUnicodeClassOperatorNewTaiLue() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("New Tai Lue");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1980"));
        assertTrue(automaton.accepts("\u19DF"));
        assertTrue(automaton.accepts("\u1990"));
        assertTrue(automaton.accepts("\u19A0"));
        assertTrue(automaton.accepts("\u19C0"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Nko.
     */
    public final void testUnicodeClassOperatorNko() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Nko");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u07C0"));
        assertTrue(automaton.accepts("\u07FF"));
        assertTrue(automaton.accepts("\u07CC"));
        assertTrue(automaton.accepts("\u07DD"));
        assertTrue(automaton.accepts("\u07EE"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Ogham.
     */
    public final void testUnicodeClassOperatorOgham() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Ogham");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1680"));
        assertTrue(automaton.accepts("\u169F"));
        assertTrue(automaton.accepts("\u1690"));
        assertTrue(automaton.accepts("\u1699"));
        assertTrue(automaton.accepts("\u1688"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Ol Chiki.
     */
    public final void testUnicodeClassOperatorOlChiki() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Ol Chiki");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1C50"));
        assertTrue(automaton.accepts("\u1C7F"));
        assertTrue(automaton.accepts("\u1C60"));
        assertTrue(automaton.accepts("\u1C70"));
        assertTrue(automaton.accepts("\u1C7A"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Old Italic.
     */
    public final void testUnicodeClassOperatorOldItalic() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Old Italic");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u10300"));
        assertTrue(automaton.accepts("\u1032F"));
        assertTrue(automaton.accepts("\u10310"));
        assertTrue(automaton.accepts("\u10320"));
        assertTrue(automaton.accepts("\u10312"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Old Persian.
     */
    public final void testUnicodeClassOperatorOldPersian() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Old Persian");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u103A0"));
        assertTrue(automaton.accepts("\u103DF"));
        assertTrue(automaton.accepts("\u103B0"));
        assertTrue(automaton.accepts("\u103C0"));
        assertTrue(automaton.accepts("\u103D2"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Oriya.
     */
    public final void testUnicodeClassOperatorOriya() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Oriya");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0B00"));
        assertTrue(automaton.accepts("\u0B7F"));
        assertTrue(automaton.accepts("\u0B10"));
        assertTrue(automaton.accepts("\u0B20"));
        assertTrue(automaton.accepts("\u0B30"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Osmanya.
     */
    public final void testUnicodeClassOperatorOsmanya() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Osmanya");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u10480"));
        assertTrue(automaton.accepts("\u104AF"));
        assertTrue(automaton.accepts("\u10490"));
        assertTrue(automaton.accepts("\u104A0"));
        assertTrue(automaton.accepts("\u10499"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Phags_Pa.
     */
    public final void testUnicodeClassOperatorPhagsPa() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Phags_Pa");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\uA840"));
        assertTrue(automaton.accepts("\uA877"));
        assertTrue(automaton.accepts("\uA850"));
        assertTrue(automaton.accepts("\uA860"));
        assertTrue(automaton.accepts("\uA870"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Phoenician.
     */
    public final void testUnicodeClassOperatorPhoenician() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Phoenician");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u10900"));
        assertTrue(automaton.accepts("\u1091F"));
        assertTrue(automaton.accepts("\u10910"));
        assertTrue(automaton.accepts("\u1091A"));
        assertTrue(automaton.accepts("\u1091C"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Rejang.
     */
    public final void testUnicodeClassOperatorRejang() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Rejang");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\uA930"));
        assertTrue(automaton.accepts("\uA95F"));
        assertTrue(automaton.accepts("\uA940"));
        assertTrue(automaton.accepts("\uA950"));
        assertTrue(automaton.accepts("\uA955"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Runic.
     */
    public final void testUnicodeClassOperatorRunic() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Runic");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u16A0"));
        assertTrue(automaton.accepts("\u16FF"));
        assertTrue(automaton.accepts("\u16B0"));
        assertTrue(automaton.accepts("\u16C0"));
        assertTrue(automaton.accepts("\u16D0"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Saurashtra.
     */
    public final void testUnicodeClassOperatorSaurashtra() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Saurashtra");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\uA880"));
        assertTrue(automaton.accepts("\uA8DF"));
        assertTrue(automaton.accepts("\uA8A0"));
        assertTrue(automaton.accepts("\uA8B0"));
        assertTrue(automaton.accepts("\uA8C0"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Shavian.
     */
    public final void testUnicodeClassOperatorShavian() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Shavian");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u10450"));
        assertTrue(automaton.accepts("\u1047F"));
        assertTrue(automaton.accepts("\u10460"));
        assertTrue(automaton.accepts("\u10470"));
        assertTrue(automaton.accepts("\u1047C"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Sinhala.
     */
    public final void testUnicodeClassOperatorSinhala() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Sinhala");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0D80"));
        assertTrue(automaton.accepts("\u0DFF"));
        assertTrue(automaton.accepts("\u0D90"));
        assertTrue(automaton.accepts("\u0DA0"));
        assertTrue(automaton.accepts("\u0DCC"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Sundanese.
     */
    public final void testUnicodeClassOperatorSundanese() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Sundanese");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1B80"));
        assertTrue(automaton.accepts("\u1BBF"));
        assertTrue(automaton.accepts("\u1B90"));
        assertTrue(automaton.accepts("\u1BA0"));
        assertTrue(automaton.accepts("\u1BB0"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Syloti Nagri.
     */
    public final void testUnicodeClassOperatorSylotiNagri() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Syloti Nagri");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\uA800"));
        assertTrue(automaton.accepts("\uA82F"));
        assertTrue(automaton.accepts("\uA810"));
        assertTrue(automaton.accepts("\uA820"));
        assertTrue(automaton.accepts("\uA822"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Syriac.
     */
    public final void testUnicodeClassOperatorSyriac() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Syriac");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0700"));
        assertTrue(automaton.accepts("\u074F"));
        assertTrue(automaton.accepts("\u0710"));
        assertTrue(automaton.accepts("\u0720"));
        assertTrue(automaton.accepts("\u0730"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Tagalog.
     */
    public final void testUnicodeClassOperatorTagalog() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Tagalog");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1700"));
        assertTrue(automaton.accepts("\u171F"));
        assertTrue(automaton.accepts("\u1710"));
        assertTrue(automaton.accepts("\u1711"));
        assertTrue(automaton.accepts("\u171C"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Tagbanwa.
     */
    public final void testUnicodeClassOperatorTagbanwa() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Tagbanwa");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1760"));
        assertTrue(automaton.accepts("\u177F"));
        assertTrue(automaton.accepts("\u1770"));
        assertTrue(automaton.accepts("\u1777"));
        assertTrue(automaton.accepts("\u177A"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Tai Le.
     */
    public final void testUnicodeClassOperatorTaiLe() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Tai Le");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u1950"));
        assertTrue(automaton.accepts("\u197F"));
        assertTrue(automaton.accepts("\u1960"));
        assertTrue(automaton.accepts("\u1970"));
        assertTrue(automaton.accepts("\u1977"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Tamil.
     */
    public final void testUnicodeClassOperatorTamil() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Tamil");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0B80"));
        assertTrue(automaton.accepts("\u0BFF"));
        assertTrue(automaton.accepts("\u0B9F"));
        assertTrue(automaton.accepts("\u0BAF"));
        assertTrue(automaton.accepts("\u0BBF"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Telugu.
     */
    public final void testUnicodeClassOperatorTelugu() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Telugu");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0C00"));
        assertTrue(automaton.accepts("\u0C7F"));
        assertTrue(automaton.accepts("\u0C10"));
        assertTrue(automaton.accepts("\u0C20"));
        assertTrue(automaton.accepts("\u0C30"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Thaana.
     */
    public final void testUnicodeClassOperatorThaana() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Thaana");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0780"));
        assertTrue(automaton.accepts("\u07BF"));
        assertTrue(automaton.accepts("\u0790"));
        assertTrue(automaton.accepts("\u07A0"));
        assertTrue(automaton.accepts("\u07B0"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Thai.
     */
    public final void testUnicodeClassOperatorThai() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Thai");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0E00"));
        assertTrue(automaton.accepts("\u0E7F"));
        assertTrue(automaton.accepts("\u0E10"));
        assertTrue(automaton.accepts("\u0E20"));
        assertTrue(automaton.accepts("\u0E30"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Tibetan.
     */
    public final void testUnicodeClassOperatorTibetan() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Tibetan");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0F00"));
        assertTrue(automaton.accepts("\u0F1F"));
        assertTrue(automaton.accepts("\u0F2F"));
        assertTrue(automaton.accepts("\u0F3F"));
        assertTrue(automaton.accepts("\u0F4F"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Tifinagh.
     */
    public final void testUnicodeClassOperatorTifinagh() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Tifinagh");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u2D30"));
        assertTrue(automaton.accepts("\u2D7F"));
        assertTrue(automaton.accepts("\u2D4F"));
        assertTrue(automaton.accepts("\u2D5F"));
        assertTrue(automaton.accepts("\u2D6F"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Ugaritic.
     */
    public final void testUnicodeClassOperatorUgaritic() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Ugaritic");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u10380"));
        assertTrue(automaton.accepts("\u1039F"));
        assertTrue(automaton.accepts("\u10390"));
        assertTrue(automaton.accepts("\u10399"));
        assertTrue(automaton.accepts("\u1039A"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Vai.
     */
    public final void testUnicodeClassOperatorVai() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Vai");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\uA500"));
        assertTrue(automaton.accepts("\uA63F"));
        assertTrue(automaton.accepts("\uA61F"));
        assertTrue(automaton.accepts("\uA62F"));
        assertTrue(automaton.accepts("\uA53F"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Yi.
     */
    public final void testUnicodeClassOperatorYi() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Yi");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\uA000"));
        assertTrue(automaton.accepts("\uA48C"));
        assertTrue(automaton.accepts("\uA18C"));
        assertTrue(automaton.accepts("\uA28C"));
        assertTrue(automaton.accepts("\uA38C"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Cc.
     */
    public final void testUnicodeClassOperatorCf() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Cf");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u00AD"));
        assertTrue(automaton.accepts("\u06DD"));
        assertTrue(automaton.accepts("\u2064"));
        assertTrue(automaton.accepts("\uFFF9"));
        assertTrue(automaton.accepts("\uE0001"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Cf.
     */
    public final void testUnicodeClassOperatorCc() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Cc");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u001F"));
        assertTrue(automaton.accepts("\u007F"));
        assertTrue(automaton.accepts("\u0080"));
        assertTrue(automaton.accepts("\u009F"));
        assertTrue(automaton.accepts("\u0090"));

        assertFalse(automaton.accepts("\u0190"));
        assertFalse(automaton.accepts("\u0690"));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u102A"));
        assertFalse(automaton.accepts("\u4190"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Co.
     */
    public final void testUnicodeClassOperatorCo() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Co");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\uE000"));
        assertTrue(automaton.accepts("\uF8FF"));
        assertTrue(automaton.accepts("\uF0000"));
        assertTrue(automaton.accepts("\uFFFFD"));
        assertTrue(automaton.accepts("\u100000"));
        assertTrue(automaton.accepts("\u10FFFD"));

        assertFalse(automaton.accepts("\u0190"));
        assertFalse(automaton.accepts("\u0690"));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u102A"));
        assertFalse(automaton.accepts("\u4190"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Cs.
     */
    public final void testUnicodeClassOperatorCs() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Cs");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\uD800"));
        assertTrue(automaton.accepts("\uDB7F"));
        assertTrue(automaton.accepts("\uDB80"));
        assertTrue(automaton.accepts("\uDBFF"));
        assertTrue(automaton.accepts("\uDC00"));
        assertTrue(automaton.accepts("\uDFFF"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Ll.
     */
    public final void testUnicodeClassOperatorLl() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Ll");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("1759signs"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Lm.
     */
    public final void testUnicodeClassOperatorLm() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Lm");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u02B0"));
        assertTrue(automaton.accepts("\u02D1"));
        assertTrue(automaton.accepts("\u10FC"));
        assertTrue(automaton.accepts("\u207F"));
        assertTrue(automaton.accepts("\u3005"));
        assertTrue(automaton.accepts("\uA770"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Lo.
     */
    public final void testUnicodeClassOperatorLo() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Lo");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("11320signs"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Lt.
     */
    public final void testUnicodeClassOperatorLt() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Lt");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u01C5"));
        assertTrue(automaton.accepts("\u1F88"));
        assertTrue(automaton.accepts("\u1F98"));
        assertTrue(automaton.accepts("\u1FA8"));
        assertTrue(automaton.accepts("\u1FBC"));
        assertTrue(automaton.accepts("\u1FFC"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Lu.
     */
    public final void testUnicodeClassOperatorLu() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Lu");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("1436signs"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Mc.
     */
    public final void testUnicodeClassOperatorMc() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Mc");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u093B"));
        assertTrue(automaton.accepts("\u0C44"));
        assertTrue(automaton.accepts("\u0D3F"));
        assertTrue(automaton.accepts("\u1083"));
        assertTrue(automaton.accepts("\u1A1B"));
        assertTrue(automaton.accepts("\u1C2B"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Me.
     */
    public final void testUnicodeClassOperatorMe() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Me");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0488"));
        assertTrue(automaton.accepts("\u0489"));
        assertTrue(automaton.accepts("\u20DD"));
        assertTrue(automaton.accepts("\uA670"));
        assertTrue(automaton.accepts("\uA672"));
        assertTrue(automaton.accepts("\u20E4"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Mn.
     */
    public final void testUnicodeClassOperatorMn() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Mn");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("1199signs"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Nd.
     */
    public final void testUnicodeClassOperatorNd() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Nd");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0C66"));
        assertTrue(automaton.accepts("\u0CEF"));
        assertTrue(automaton.accepts("\u19D9"));
        assertTrue(automaton.accepts("\uA620"));
        assertTrue(automaton.accepts("\uA9D0"));
        assertTrue(automaton.accepts("\u1D7CE"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Nl.
     */
    public final void testUnicodeClassOperatorNl() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Nl");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u16EE"));
        assertTrue(automaton.accepts("\u2160"));
        assertTrue(automaton.accepts("\u2185"));
        assertTrue(automaton.accepts("\u1034A"));
        assertTrue(automaton.accepts("\u103D5"));
        assertTrue(automaton.accepts("\u12462"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia No.
     */
    public final void testUnicodeClassOperatorNo() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("No");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u00B3"));
        assertTrue(automaton.accepts("\u2079"));
        assertTrue(automaton.accepts("\u3229"));
        assertTrue(automaton.accepts("\uA830"));
        assertTrue(automaton.accepts("\u10178"));
        assertTrue(automaton.accepts("\u10A7D"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Pc.
     */
    public final void testUnicodeClassOperatorPc() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Pc");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u005F"));
        assertTrue(automaton.accepts("\u203F"));
        assertTrue(automaton.accepts("\uFE4D"));
        assertTrue(automaton.accepts("\uFE4F"));
        assertTrue(automaton.accepts("\uFE33"));
        assertTrue(automaton.accepts("\uFF3F"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Pd.
     */
    public final void testUnicodeClassOperatorPd() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Pd");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u002D"));
        assertTrue(automaton.accepts("\u05BE"));
        assertTrue(automaton.accepts("\u1806"));
        assertTrue(automaton.accepts("\u2010"));
        assertTrue(automaton.accepts("\uFE31"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Pe.
     */
    public final void testUnicodeClassOperatorPe() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Pe");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u005D"));
        assertTrue(automaton.accepts("\u169C"));
        assertTrue(automaton.accepts("\u2771"));
        assertTrue(automaton.accepts("\u2E29"));
        assertTrue(automaton.accepts("\uFE3C"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Pf.
     */
    public final void testUnicodeClassOperatorPf() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Pf");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u2019"));
        assertTrue(automaton.accepts("\u203A"));
        assertTrue(automaton.accepts("\u2E0A"));
        assertTrue(automaton.accepts("\u2E1D"));
        assertTrue(automaton.accepts("\u2E21"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Pi.
     */
    public final void testUnicodeClassOperatorPi() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Pi");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u00AB"));
        assertTrue(automaton.accepts("\u201B"));
        assertTrue(automaton.accepts("\u2039"));
        assertTrue(automaton.accepts("\u2E09"));
        assertTrue(automaton.accepts("\u2E1C"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Po.
     */
    public final void testUnicodeClassOperatorPo() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Po");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u002A"));
        assertTrue(automaton.accepts("\u00BF"));
        assertTrue(automaton.accepts("\u055A"));
        assertTrue(automaton.accepts("\u061E"));
        assertTrue(automaton.accepts("\u0830"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u0019"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Ps.
     */
    public final void testUnicodeClassOperatorPs() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Ps");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0028"));
        assertTrue(automaton.accepts("\u007B"));
        assertTrue(automaton.accepts("\u2987"));
        assertTrue(automaton.accepts("\u2995"));
        assertTrue(automaton.accepts("\uFE39"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u0019"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Sc.
     */
    public final void testUnicodeClassOperatorSc() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Sc");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u00A2"));
        assertTrue(automaton.accepts("\u060B"));
        assertTrue(automaton.accepts("\u09FB"));
        assertTrue(automaton.accepts("\u20B9"));
        assertTrue(automaton.accepts("\uFFE0"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u0019"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Sk.
     */
    public final void testUnicodeClassOperatorSk() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Sk");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u005E"));
        assertTrue(automaton.accepts("\u00B8"));
        assertTrue(automaton.accepts("\u02C2"));
        assertTrue(automaton.accepts("\u02EF"));
        assertTrue(automaton.accepts("\uA78A"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u0019"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Sm.
     */
    public final void testUnicodeClassOperatorSm() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Sm");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("948signs"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia So.
     */
    public final void testUnicodeClassOperatorSo() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("So");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("4398signs"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Zl.
     */
    public final void testUnicodeClassOperatorZl() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Zl");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u2028"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Zp.
     */
    public final void testUnicodeClassOperatorZp() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Zp");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u2029"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }

    /**
     * Testuje automat UnicodeClassOperator dla przejscia Zs.
     */
    public final void testUnicodeClassOperatorZs() {

        ArrayList<String> params = new ArrayList<String>();
        params.add("Zs");
        RegexpOperator spec = (new UnicodeClassOperator.Factory()).createOperator(params);
        NondeterministicAutomatonByThompsonApproach automaton =
            new NondeterministicAutomatonByThompsonApproach(spec.createAutomaton(
                new ArrayList<AutomatonSpecification>()));

        assertTrue(automaton.accepts("\u0020"));
        assertTrue(automaton.accepts("\u00A0"));
        assertTrue(automaton.accepts("\u2000"));
        assertTrue(automaton.accepts("\u3000"));
        assertTrue(automaton.accepts("\u200A"));

        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts("\u0099"));
        assertFalse(automaton.accepts("\u0100"));
        assertFalse(automaton.accepts("\u002A"));
        assertFalse(automaton.accepts("w"));
    }
}
