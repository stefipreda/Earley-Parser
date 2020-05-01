import java.util.List;

public class Rule {
    public Nonterminal lhs;
    public List<Nonterminal> rhs;
    public Rule(Nonterminal n, List<Nonterminal> l){
        lhs = n;
        rhs = l;
    }
}
