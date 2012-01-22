package pl.edu.amu.wmi.daut.re;

import pl.edu.amu.wmi.daut.base.State;
import pl.edu.amu.wmi.daut.base.AutomatonSpecification;
import pl.edu.amu.wmi.daut.base.OutgoingTransition;
import pl.edu.amu.wmi.daut.base.TransitionLabel;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Klasa zwracajaca wyrazenie regularne ackeptujace ten sam jezyk co przekazany deterministyczny
 * automat skonczenie stanowy.
 */
public class AutomataToRegexp {

    private static Map<State, List<State>> previousStates = new HashMap<State,  List<State>>();
    private static Map<State, List<State>> nextStates = new HashMap<State,  List<State>>();
    private static Map<State, List<State>> previousBackup = new HashMap<State,  List<State>>();
    private static Map<State, List<State>> nextBackup = new HashMap<State,  List<State>>();
    private static Map<String, String> transitionLabels = new HashMap<String, String>();
    private static Map<String, String> transitionLabelsBackup = new HashMap<String, String>();
    private static Stack<Integer> bracketStack = new Stack<Integer>();
    private static Stack<Boolean> bracketRemove = new Stack<Boolean>();

    public static String createRegularExpression(AutomatonSpecification automaton) {
        String regexp = "";
        State initial = automaton.getInitialState();
        List<State> finalStates = new LinkedList<State>();

        List<State> next;       //lista tymczasowa
        List<State> previous;   //lista tymczasowa
        for (State state : automaton.allStates()) {
            next = new LinkedList<State>();
            for (OutgoingTransition out : automaton.allOutgoingTransitions(state)) {
                State target = out.getTargetState();
                next.add(target);
                if (previousStates.containsKey(target)) {
                    previous = previousStates.get(target);
                    previous.add(state);
                    previousStates.put(target, previous);
                }
                else {
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

        String R, S, U, T, reg;
        for (State state : finalStates) {
            transitionLabelsBackup = new HashMap<String, String>(transitionLabels);
            previousBackup = new HashMap<State, List<State>>();
            for (State s : previousStates.keySet()) {
                previous = new LinkedList<State>();
                for (State st : previousStates.get(s))
                    previous.add(st);
                previousBackup.put(s, previous);
            }
            nextBackup = new HashMap<State, List<State>>();
            for (State s : nextStates.keySet()) {
                next = new LinkedList<State>();
                for (State st : nextStates.get(s))
                    next.add(st);
                nextBackup.put(s, next);
            }

            for (State toRemove : finalStates) {
                if (state != toRemove && toRemove != initial)
                    remove(toRemove);
            }
            if (state == initial) {
                if (regexp.equals("")) {
                    if (transitionLabels.get(hashOf(state,state)).equals(""))
                        regexp = "(\u03B5)";
                    else
                        regexp = "("+transitionLabels.get(hashOf(state,state))+")*";
                }
                else
                    regexp = regexp+"|"+"("+transitionLabels.get(hashOf(state,state))+")*";
            }
            else {
                R = getLabel(initial, initial);
                S = getLabel(initial, state);
                U = getLabel(state, state);
                T = getLabel(state, initial);
                if (R.length()>0) {
                    if (T.length() >0)
                        reg = "("+R+"|"+"("+S+")"+"("+U+")*"+"("+T+")"+")*"+"("+S+")"+"("+U+")*";
                    else
                        reg = "("+R+")*"+"("+S+")"+"("+U+")*";
                }
                else {
                    if (T.length() >0)
                        reg = "(("+S+")"+"("+U+")*"+"("+T+")"+")*"+"("+S+")"+"("+U+")*";
                    else
                        reg = "("+S+")"+"("+U+")*";
                }
                if (regexp.equals(""))
                    regexp = reg;
                else
                    regexp = regexp+"|"+reg;
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
        return "From"+String.valueOf(from.hashCode())+"To"+String.valueOf(to.hashCode());
    }

    /**
     * 'Usuwa' stan z automatu, tworzac nowe etykiety przejscia.
     * @param state - usuwany stan
     */
    private static void remove(State state) {
        String Rp, Sp, U, Tp, Rn, Sn, Tn, Spn;
        List<State> prevS;
        List<State> nextS;
        for (State previous : previousStates.get(state)) {

            if (previous == state)
                continue;
            Rp = getLabel(previous, previous);
            Sp = getLabel(previous, state);
            U = getLabel(state, state);
            Tp = getLabel(state, previous);

            if(Sp.equals(""))
                continue;

            boolean empty = true;
            for (State next : nextStates.get(state)) {

                if (next == state)
                    continue;
                empty = false;
                Rn = getLabel(next, next);
                Sn = getLabel(state, next);
                Tn = getLabel(next, state);
                Spn = getLabel(previous, next);

                if (Spn.length()>0)
                    Spn = Spn+"|"+"("+Sp+")"+"("+U+")*"+"("+Sn+")";
                else
                    Spn = "("+Sp+")"+"("+U+")*"+"("+Sn+")";
                if (Tp.length()>0) {
                    if (Rp.length()>0)
                        Rp = Rp+"|"+"("+Sp+")"+"("+U+")*"+"("+Tp+")";
                    else
                        Rp = "("+Sp+")"+"("+U+")*"+"("+Tp+")";
                }
                if (Tn.length()>0) {
                    if (Rn.length()>0)
                        Rn = Rn+"|"+"("+Tn+")"+"("+U+")*"+"("+Sn+")";
                    else
                        Rn = "("+Tn+")"+"("+U+")*"+"("+Sn+")";
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
                    transitionLabels.remove(hashOf(next,state));
                }

                transitionLabels.put(hashOf(previous,next), Spn);
                transitionLabels.put(hashOf(previous,previous), Rp);
                transitionLabels.put(hashOf(next,next), Rn);
            }

            if(empty)
                continue;
            nextS = nextStates.get(previous);
            nextS.remove(state);
            nextStates.put(previous, nextS);
            transitionLabels.remove(hashOf(previous,state));
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
            reg = removeChars(reg, reg.indexOf("()*"), 3);

        int i=reg.indexOf("(");
        if (i==-1)
            return reg;
        do {
            if (reg.charAt(i)=='(') {
                int j=1;
                boolean leave = false;
                boolean removeBracket = true;
                do {
                    if (reg.charAt(i+j)=='(') {
                        bracketStack.push(i);
                        bracketRemove.push(removeBracket);
                        i=i+j;
                        j=1;
                        removeBracket = true;
                    }
                    else if (reg.charAt(i+j)==')') {
                        if (removeBracket) {
                            if (i+j+1 < reg.length() && j-i>2) {
                                if (reg.charAt(i+j+1)=='*') {
                                    i=i+j+1;
                                    leave = true;
                                }
                            }
                            if (!leave) {
                                reg = removeChars(reg, i+j, 1);
                                reg = removeChars(reg, i, 1);
                                if (bracketStack.size()>0) {
                                    i=bracketStack.pop();
                                    removeBracket=bracketRemove.pop();
                                    j=1;
                                }
                                else
                                    leave = true;
                            }
                        }
                        else {
                            i=i+j;
                            leave = true;
                        }
                    }
                    else if (reg.charAt(i+j)=='|')
                    {
                        removeBracket = false;
                        j++;
                    }
                    else
                        j++;
                } while (!leave);
            }
            i++;
        } while (i<reg.length());

        return reg;
    }

    /**
     * Poprawia zapis znajdujac pozytywne domkniecia Kleene'ego.
     */
    private static String fixKleene(String reg) {
        int ind = reg.indexOf('*');
        int beg, len;
        String expr;
        while (ind >=1) {
            char character = reg.charAt(ind-1);
            if (character == ')') {
                beg = reg.substring(0, ind).lastIndexOf("(");
                expr = reg.substring(beg+1, ind-1);
                len = expr.length();
                if (expr.contains("|")) {
                    if (ind+len+2 < reg.length()) {
                        if (reg.substring(ind+1, ind+1+len+2).equals("("+expr+")")) {
                            replace(reg, ind, '+');
                            removeChars(reg, ind+1, len+2);
                        }
                    }
                    if (ind-4-len*2 >=0) {
                        if (reg.substring(ind-4-len*2, ind-2-len).equals("("+expr+")")) {
                            replace(reg, ind, '+');
                            removeChars(reg, ind-4-len*2, len+2);
                        }
                    }
                }
                else {
                    if (ind+len < reg.length()) {
                        if (reg.substring(ind+1, ind+1+len).equals(expr)) {
                            replace(reg, ind, '+');
                            removeChars(reg, ind+1, len);
                        }
                    }
                    if (ind-2-len*2 >=0) {
                        if (reg.substring(ind-2-len*2, ind-2-len).equals(expr)) {
                            replace(reg, ind, '+');
                            removeChars(reg, ind-2-len*2, len);
                        }
                    }
                }
            }
            else {
                if (ind+1 < reg.length())
                    if (reg.charAt(ind+1)==character) {
                            reg = replace(reg, ind, '+');
                            reg = removeChars(reg, ind+1, 1);
                        }
                if (ind-2 >= 0) {
                    if (reg.charAt(ind-2)==character) {
                        reg = replace(reg, ind, '+');
                        reg = removeChars(reg, ind-2, 1);
                    }
                }
            }
            ind=reg.indexOf('*', ind+1);
        }
        return reg;
    }

    /**
     * @param reg - wyrazenie ktore jest zmieniane.
     * @param ind - pozycja znaku do zmiany.
     * @param newChar - nowy znak, ktory ma zostac umieszczony.
     */
    private static String replace(String reg, int ind, char newChar) {
        reg = reg.substring(0, ind) + newChar + reg.substring(ind+1);
        return reg;
    }

    /**
     * Usuwa z podanego wyrazenia 'count' znakow poczynajac od indeksu 'ind'.
     */
    private static String removeChars(String reg, int ind, int count) {
        reg = reg.substring(0, ind)+reg.substring(ind+count);
        return reg;
    }
}
