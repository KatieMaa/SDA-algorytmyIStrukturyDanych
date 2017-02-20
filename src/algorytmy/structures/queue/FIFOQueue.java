package algorytmy.structures.queue;

/**
 * Created by RENT on 2017-02-18.
 */
public class FIFOQueue extends AbstractQueue{

    public FIFOQueue() {
    }

    public FIFOQueue(int value) { super(value); }

    @Override
    protected AbstractQueue getInstance() {
        return new FIFOQueue();
    }

    @Override
    protected AbstractQueue getInstance(int value) {
        return new FIFOQueue();
    }

    @Override
    public void push(int value) {
        AbstractQueue last = getLast();
        last.next = new FIFOQueue(value);
    }


}
