public class Parser {
    public static void main(String[] args) {
        Grammar G = new Grammar();
        G.initialise();
        Nonterminal dot = new Nonterminal("*", false);
        Chart chart = new Chart();
    }
}
