import java.util.LinkedList;
import java.util.List;

public class Chart {
    public class Row{
        public int id;
        public Rule rule;
        public int starting;
        public int waiting;
        public List<Integer> history = new LinkedList<>();
    }

    public List<Row> rows = new LinkedList<>();;
}
