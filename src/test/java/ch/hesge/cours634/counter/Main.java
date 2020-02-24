import ch.hesge.cours634.counter.Counter;

public class Main {

    public static void main(String[] args) {
        Counter c = new Counter(5, 10);
        c.inc();
        c.add(2);
        c.getValue();
    }
}
