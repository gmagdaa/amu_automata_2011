package pl.edu.amu.wmi.daut.re;

import pl.edu.amu.wmi.daut.base.State;
import pl.edu.amu.wmi.daut.base.AutomatonSpecification;
import pl.edu.amu.wmi.daut.base.OutgoingTransition;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Klasa zwracajaca wyrazenie regularne ackeptujace ten sam jezyk co przekazany deterministyczny
 * automat skonczenie stanowy.
 */
public final class AutomataToRegexp {

    private static Map<State, List<State>> previousStates = new HashMap<State,  List<State>>();
    private static Map<State, List<State>> nextStates = new HashMap<State,  List<State>>();
    private static Map<State, List<State>> previousBackup = new HashMap<State,  List<State>>();
    private static Map<State, List<State>> nextBackup = new HashMap<State,  List<State>>();
    private static Map<String, String> transitionLabels = new HashMap<String, String>();
    private static Map<String, String> transitionLabelsBackup = new HashMap<String, String>();
    private static Stack<Integer> bracketStack = new Stack<Integer>();
    private static Stack<Boolean> bracketRemove = new Stack<Boolean>();

    /**
     * Domyslny konstruktor.
     */
    private AutomataToRegexp() { }

    /**
     * Konwertuje automat do wyrazenia regularnego.
     */
    public static String createRegularExpression(AutomatonSpecification automaton) {
        String regexp = "";
        State initial = automaton.getInitialState();
        List<State> finalStates = new LinkedList<State>();

        List<State> next;       //lista tymczasowa.
        List<State> previous;   //lista tymczasowa.
        for (State state : automaton.allStates()) {
            next = new LinkedList<State>();
            for (OutgoingTransition out : automaton.allOutgoingTransitions(state)) {
                State target = out.getTargetState();
                next.add(target);
                if (previousStates.containsKey(target)) {
                    previous = previousStates.get(target);
                    previous.add(state);
                    previousStates.put(target, previous);
                } else {
                    previous = new LinkedList<State>();
                    previous.add(state);
                    previousStates.put(target, previous);
                }
                transitionLabels.put(hashOf(state, target), out.getTransitionLabel().toString());
            }
            nextStates.put(state, next);
            if (automaton.isFinal(state))
                finalStates.add(state);
        }

        for (State state : automaton.allStates()) {
            if (!automaton.isFinal(state) && state != initial) {
                remove(state);
            }
        }

        String r, s, u, t, reg;
        for (State state : finalStates) {
            transitionLabelsBackup = new HashMap<String, String>(transitionLabels);
            previousBackup = new HashMap<State, List<State>>();
            for (State prevState : previousStates.keySet()) {
                previous = new LinkedList<State>();
                for (State st : previousStates.get(prevState))
                    previous.add(st);
                previousBackup.put(prevState, previous);
            }
            nextBackup = new HashMap<State, List<State>>();
            for (State prevState : nextStates.keySet()) {
                next = new LinkedList<State>();
                for (State st : nextStates.get(prevState))
                    next.add(st);
                nextBackup.put(prevState, next);
            }

            for (State toRemove : finalStates) {
                if (state != toRemove && toRemove != initial)
                    remove(toRemove);
            }
            if (state == initial) {
                if (regexp.equals("")) {
                    if (transitionLabels.get(hashOf(state, state)).equals(""))
                        regexp = "(\u03B5)";
                    else
                        regexp = "(" + transitionLabels.get(hashOf(state, state)) + ")*";
                } else
                    regexp = regexp + "|" + "(" + transitionLabels.get(hashOf(state, state)) + ")*";
            } else {
                r = getLabel(initial, initial);
                s = getLabel(initial, state);
                u = getLabel(state, state);
                t = getLabel(state, initial);
                if (r.length() > 0) {
                    if (t.length() > 0)
                        reg = "(" + r + "|" + "(" + s + ")" + "(" + u + ")*" + "(" + t + ")" + ")*"
                                + "(" + s + ")" + "(" + u + ")*";
                    else
                        reg = "(" + r + ")*" + "(" + s + ")" + "(" + u + ")*";
                } else {
                    if (t.length() > 0)
                        reg = "((" + s + ")" + "(" + u + ")*" + "(" + t + ")" + ")*" + "(" + s + ")"
                                + "(" + u + ")*";
                    else
                        reg = "(" + s + ")" + "(" + u + ")*";
                }
                if (regexp.equals(""))
                    regexp = reg;
                else
                    regexp = regexp + "|" + reg;
            }
            previousStates.clear();
            previousStates.putAll(previousBackup);
            nextStates.clear();
            nextStates.putAll(nextBackup);
            transitionLabels.clear();
            transitionLabels.putAll(transitionLabelsBackup);
        }

        if (regexp.contains("(null)*"))
            regexp = regexp.replace("(null)*", "\u03B5");
        return fixKleene(fixBrackets(regexp));
    }

    /**
     * Zwraca reprezetnacje tekstowa pary stanow from-to.
     */
    private static String hashOf(State from, State to) {
        return "From" + String.valueOf(from.hashCode()) + "To" + String.valueOf(to.hashCode());
    }

    /**
     * 'Usuwa' stan z automatu, tworzac nowe etykiety przejscia.
     * @param state - usuwany stan.
     */
    private static void remove(State state) {
        String rp, sp, u, tp, rn, sn, tn, spn;
        List<State> prevS;
        List<State> nextS;
        for (State previous : previousStates.get(state)) {

            if (previous == state)
                continue;
            rp = getLabel(previous, previous);
            sp = getLabel(previous, state);
            u = getLabel(state, state);
            tp = getLabel(state, previous);

            if (sp.equals(""))
                continue;

            boolean empty = true;
            for (State next : nextStates.get(state)) {

                if (next == state)
                    continue;
                empty = false;
                rn = getLabel(next, next);
                sn = getLabel(state, next);
                tn = getLabel(next, state);
                spn = getLabel(previous, next);

                if (spn.length() > 0)
                    spn = spn + "|" + "(" + sp + ")" + "(" + u + ")*" + "(" + sn + ")";
                else
                    spn = "(" + sp + ")" + "(" + u + ")*" + "(" + sn + ")";
                if (tp.length() > 0) {
                    if (rp.length() > 0)
                        rp = rp + "|" + "(" + sp + ")" + "(" + u + ")*" + "(" + tp + ")";
                    else
                        rp = "(" + sp + ")" + "(" + u + ")*" + "(" + tp + ")";
                }
                if (tn.length() > 0) {
                    if (rn.length() > 0)
                        rn = rn + "|" + "(" + tn + ")" + "(" + u + ")*" + "(" + sn + ")";
                    else
                        rn = "(" + tn + ")" + "(" + u + ")*" + "(" + sn + ")";
                }

                nextS = nextStates.get(previous);
                nextS.add(next);
                nextStates.put(previous, nextS);

                prevS = previousStates.get(next);
                prevS.add(previous);
                previousStates.put(next, prevS);

                nextS = nextStates.get(next);
                if (nextS.contains(state)) {
                    nextS.remove(state);
                    nextStates.put(next, nextS);
                    prevS = previousStates.get(next);
                    prevS.remove(state);
                    previousStates.put(next, prevS);
                    transitionLabels.remove(hashOf(next, state));
                }

                transitionLabels.put(hashOf(previous, next), spn);
                transitionLabels.put(hashOf(previous, previous), rp);
                transitionLabels.put(hashOf(next, next), rn);
            }

            if (empty)
                continue;
            nextS = nextStates.get(previous);
            nextS.remove(state);
            nextStates.put(previous, nextS);
            transitionLabels.remove(hashOf(previous, state));
        }
        nextStates.remove(state);
        previousStates.remove(state);
    }

    /**
     * Zwraca etykiete przejscia dla pary from-to.
     */
    private static String getLabel(State from, State to) {
        String label = transitionLabels.get(hashOf(from, to));
        if (label != null)
            return label;
        else
            return "";
    }

    /**
     * Usuwa zbedne nawiasy w wyrazeniach jednoznakowych.
     */
    private static String fixBrackets(String reg) {
        while (reg.contains("()*"))
            reg = removeChars(reg, reg.indexOf("()*"), "()*".length());

        int i = reg.indexOf("(");
        if (i == -1)
            return reg;
        do {
            if (reg.charAt(i) == '(') {
                int j = 1;
                boolean leave = false;
                boolean removeBracket = true;
                do {
                    if (reg.charAt(i + j) == '(') {
                        bracketStack.push(i);
                        bracketRemove.push(removeBracket);
                        i = i + j;
                        j = 1;
                        removeBracket = true;
                    }
                    else if (reg.charAt(i + j) == ')') {
                        if (removeBracket) {
                            if (i + j + 1 < reg.length() && j - i > 2)
                                if (reg.charAt(i + j + 1) == '*') {
                                    i = i + j + 1;
                                    leave = true;
                                }
                            if (!leave) {
                                reg = removeChars(reg, i + j, 1);
                                reg = removeChars(reg, i, 1);
                                if (bracketStack.size() > 0) {
                                    i = bracketStack.pop();
                                    removeBracket = bracketRemove.pop();
                                    j = 1;
                                } else
                                    leave = true;
                            }
                        } else {
                            i = i + j;
                            leave = true;
                        }
                    } else if (reg.charAt(i + j) == '|') {
                        removeBracket = false;
                        j++;
                    } else
                        j++;
                } while (!leave);
            }
            i++;
        } while (i < reg.length());

        return reg;
    }

    /**
     * Poprawia zapis znajdujac pozytywne domkniecia Kleene'ego.
     */
    private static String fixKleene(String reg) {
        int ind = reg.indexOf('*');
        int beg, len;
        String expr;
        while (ind >= 1) {
            char character = reg.charAt(ind - 1);
            if (character == ')') {
                beg = reg.substring(0, ind).lastIndexOf("(");
                expr = reg.substring(beg + 1, ind - 1);
                len = expr.length();
                if (expr.contains("|")) {
                    if (ind + len + 2 < reg.length())
                        if (reg.substring(ind + 1, ind + 1 + len + 2).equals("(" + expr + ")")) {
                            replace(reg, ind, '+');
                            removeChars(reg, ind + 1, len + 2);
                        }
                    if (ind - (2 - len) * 2 >= 0)
                        if (reg.substring(ind - (2 - len) * 2, ind - 2 - len).equals(
                                "(" + expr + ")")) {
                            replace(reg, ind, '+');
                            removeChars(reg, ind - (2 - len) * 2, len + 2);
                        }
                } else {
                    if (ind + len < reg.length())
                        if (reg.substring(ind + 1, ind + 1 + len).equals(expr)) {
                            replace(reg, ind, '+');
                            removeChars(reg, ind + 1, len);
                        }
                    if (ind - 2 - len * 2 >= 0)
                        if (reg.substring(ind - 2 - len * 2, ind - 2 - len).equals(expr)) {
                            replace(reg, ind, '+');
                            removeChars(reg, ind - 2 - len * 2, len);
                        }
                }
            } else {
                if (ind + 1 < reg.length())
                    if (reg.charAt(ind + 1) == character) {
                            reg = replace(reg, ind, '+');
                            reg = removeChars(reg, ind + 1, 1);
                        }
                if (ind - 2 >= 0) {
                    if (reg.charAt(ind - 2) == character) {
                        reg = replace(reg, ind, '+');
                        reg = removeChars(reg, ind - 2, 1);
                    }
                }
            }
            ind = reg.indexOf('*', ind + 1);
        }
        return reg;
    }

    /**
     * @param reg - wyrazenie ktore jest zmieniane.
     * @param ind - pozycja znaku do zmiany.
     * @param newChar - nowy znak, ktory ma zostac umieszczony.
     */
    private static String replace(String reg, int ind, char newChar) {
        reg = reg.substring(0, ind) + newChar + reg.substring(ind + 1);
        return reg;
    }

    /**
     * Usuwa z podanego wyrazenia 'count' znakow poczynajac od indeksu 'ind'.
     */
    private static String removeChars(String reg, int ind, int count) {
        reg = reg.substring(0, ind) + reg.substring(ind + count);
        return reg;
    }
}
