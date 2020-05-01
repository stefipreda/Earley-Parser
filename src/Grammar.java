import java.util.*;

public class Grammar {
    Set<Nonterminal> nonterminals;
    Set<Nonterminal> alphabet;
    Nonterminal start;
    Set<Rule> productions;

    public void initialise(){
        //Initialise non-terminals
        nonterminals = new HashSet<>();
        Nonterminal s = new Nonterminal("S", false);
        nonterminals.add(s);
        Nonterminal np = new Nonterminal("NP", false);
        nonterminals.add(np);
        Nonterminal vp = new Nonterminal("VP", false);
        nonterminals.add(vp);
        Nonterminal pp = new Nonterminal("PP", false);
        nonterminals.add(pp);
        Nonterminal n = new Nonterminal("N", false);
        nonterminals.add(n);
        Nonterminal v = new Nonterminal("V", false);
        nonterminals.add(v);
        Nonterminal p = new Nonterminal("P", false);
        nonterminals.add(p);

        //Initialise alphabet
        alphabet = new HashSet<>();
        Nonterminal can = new Nonterminal("can", true);
        alphabet.add(can);
        Nonterminal fish = new Nonterminal("fish", true);
        alphabet.add(fish);
        Nonterminal in = new Nonterminal("in", true);
        alphabet.add(in);
        Nonterminal rivers = new Nonterminal("rivers", true);
        alphabet.add(rivers);
        Nonterminal they = new Nonterminal("they", true);
        alphabet.add(they);

        //Initialise start state
        start = s;

        //Initialise production rules
        productions = new HashSet<>();
        // S -> NP VP
        List<Nonterminal> rhs = new LinkedList();
        rhs.add(np);
        rhs.add(vp);
        productions.add(new Rule(s, rhs));

        // NP -> N PP
        rhs.clear();
        rhs.add(n);
        rhs.add(pp);
        productions.add(new Rule(np, rhs));

        // NP -> N
        rhs.clear();
        rhs.add(n);
        productions.add(new Rule(np, rhs));

        // PP -> P NP
        rhs.clear();
        rhs.add(p);
        rhs.add(np);
        productions.add(new Rule(pp, rhs));

        // VP -> VP PP
        rhs.clear();
        rhs.add(vp);
        rhs.add(pp);
        productions.add(new Rule(vp, rhs));

        // VP -> V VP
        rhs.clear();
        rhs.add(v);
        rhs.add(vp);
        productions.add(new Rule(vp, rhs));

        // VP -> V NP
        rhs.clear();
        rhs.add(v);
        rhs.add(np);
        productions.add(new Rule(vp, rhs));

        // VP -> V
        rhs.clear();
        rhs.add(v);
        productions.add(new Rule(vp, rhs));

        // N -> can
        rhs.clear();
        rhs.add(can);
        productions.add(new Rule(n, rhs));

        // N -> fish
        rhs.clear();
        rhs.add(fish);
        productions.add(new Rule(n, rhs));

        //N -> rivers
        rhs.clear();
        rhs.add(rivers);
        productions.add(new Rule(n, rhs));

        //P -> in
        rhs.clear();
        rhs.add(in);
        productions.add(new Rule(p, rhs));

        //V -> can
        rhs.clear();
        rhs.add(can);
        productions.add(new Rule(v, rhs));

        //V -> fish
        rhs.clear();
        rhs.add(fish);
        productions.add(new Rule(v, rhs));
    }
}
