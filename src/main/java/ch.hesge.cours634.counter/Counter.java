package ch.hesge.cours634.counter;

public class Counter implements ICounter {
    private int init;
    private int max;

    public Counter(int init, int max) {
        this.init = init;
        this.max = max;
    }

    @Override
    public void inc() throws CounterException {
        init=+1;
    }

    @Override
    public void add(int step) throws CounterException {
        init=+step;
    }

    @Override
    public int getValue() {
        return init;
    }
}
